package org.dss.pdfcreator.services.bibliographic;

import static org.junit.Assert.*;

import java.util.List;

import org.dss.pdfcreator.model.bibliographic.Article;
import org.dss.pdfcreator.model.bibliographic.BibliographicInfo;
import org.dss.pdfcreator.model.bibliographic.Magazine;
import org.dss.pdfcreator.model.bibliographic.MagazineBuilder;
import org.dss.pdfcreator.services.configuration.DatabaseConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={DatabaseConfiguration.class})
public class MagazineServiceTest {

	private MagazineService magazineService;
	
	@Autowired
	private NamedParameterJdbcOperations template;
	
	@Before
	public void setUp() throws Exception {
		magazineService = new MagazineService(template);
	}

	@After
	public void tearDown() throws Exception {
		magazineService = null;
	}

	@Test
	public void testAdd() {
		MagazineBuilder magazineBuilder = new MagazineBuilder();
		magazineBuilder.addBibliographicInfo(new BibliographicInfo());
		magazineBuilder.addArticle(1, new Article());
		magazineService.add(magazineBuilder.getMagazine());
		List<Magazine> actualList = magazineService.list();
		
		assertNotNull("The list of items is null.", actualList);
		
		Magazine magazineActual = actualList.get(0);
		assertSame("The added item is not the same as the retrieved one", magazineBuilder.getMagazine(), magazineActual);
	}

	@Test
	public void testDelete() {
		MagazineBuilder magazineBuilder = new MagazineBuilder();
		magazineBuilder.addBibliographicInfo(new BibliographicInfo());
		magazineBuilder.addArticle(1, new Article());
		magazineService.add(magazineBuilder.getMagazine());
		List<Magazine> actualList1 = magazineService.list();
		
		magazineService.delete(magazineBuilder.getMagazine());
		
		List<Magazine> actualList2 = magazineService.list();
		
		assertNotNull("Empty magazine list",actualList1);
		assertNotNull("Empty magazine list",actualList2);
		
		assertTrue(actualList1.size() > actualList2.size());
	}

	@Test
	public void testUpdate() {
		MagazineBuilder magazineBuilder = new MagazineBuilder();
		magazineBuilder.addBibliographicInfo(new BibliographicInfo());
		magazineBuilder.addArticle(1, new Article());
		magazineService.add(magazineBuilder.getMagazine());
		
		magazineBuilder.addArticle(2, new Article());
		magazineService.update(magazineBuilder.getMagazine());
		List<Magazine> actualList1 = magazineService.list();
		
		assertNotNull("Empty magazine list", actualList1);
		
		Magazine magazine = actualList1.get(0);
		assertNotNull("Magazine not found.", magazine);
		
		int size = magazine.getArticles().entrySet().size();
		
		assertEquals("Update was not done", 2, size);
	}

	@Test
	public void testList() {
		List<Magazine> list = magazineService.list();
		assertNotNull("The magazine list is empty.", list);
		assertFalse(list.isEmpty());
	}

}
