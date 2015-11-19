/**
 * 
 */
package org.dss.pdfcreator.model.bibliographic;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Andrei
 *
 */
public class MagazineBuilderTest {
	
	private MagazineBuilder builder;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		builder = new MagazineBuilder(); 
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		builder = null;
	}

	/**
	 * Test method for {@link org.dss.pdfcreator.model.bibliographic.MagazineBuilder#getMagazine()}.
	 */
	@Test
	public void testGetMagazine() {
		BibliographicInfo bibliographicInfo = new BibliographicInfo();
		Article article = new Article();
		builder.addBibliographicInfo(bibliographicInfo);
		builder.addArticle(1, article);
		
		Magazine magazine = builder.getMagazine();
		assertNotNull(magazine);
	}	
	
	@Test(expected=IllegalStateException.class)
	public void testGetMagazineException(){
		builder.getMagazine();
	}
	
	/**
	 * Test method for {@link org.dss.pdfcreator.model.bibliographic.MagazineBuilder#addBibliographicInfo(org.dss.pdfcreator.model.bibliographic.BibliographicInfo)}.
	 */
	@Test
	public void testAddBibliographicInfo() {
		BibliographicInfo bibliographicInfo = new BibliographicInfo();
		Article article = new Article();
		builder.addBibliographicInfo(bibliographicInfo);
		builder.addArticle(1, article);
		
		Magazine magazine = builder.getMagazine();
		BibliographicInfo actual = magazine.getInfo();
		assertNotNull(actual);
		assertSame(bibliographicInfo, actual);
	}

	/**
	 * Test method for {@link org.dss.pdfcreator.model.bibliographic.MagazineBuilder#addArticle(java.lang.Integer, org.dss.pdfcreator.model.bibliographic.Article)}.
	 */
	@Test
	public void testAddArticle() {
		BibliographicInfo bibliographicInfo = new BibliographicInfo();
		Article article = new Article();
		builder.addBibliographicInfo(bibliographicInfo);
		builder.addArticle(1, article);
		
		Magazine magazine = builder.getMagazine();
		Map<Integer, Article> actual = magazine.getArticles();
		assertNotNull(actual);
		assertSame(article, actual.get(1));		
	}



}
