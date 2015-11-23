package org.dss.pdfcreator.model.bibliographic;

import java.util.HashMap;
import java.util.Map;

public class MagazineBuilder {

	private BibliographicInfo info;
	
	private Map<Integer, Article> articles;
	
	private Integer id;
	
	private synchronized Magazine createMagazineInstance(){
		return new Magazine();
	}
	
	public MagazineBuilder addBibliographicInfo(BibliographicInfo info){
		this.info = info;
		return this;
	}
	
	
	public MagazineBuilder addId(Integer id){
		this.id = id;
		return this;
	}
	
	public MagazineBuilder addArticle(Integer page, Article art){
		if(articles == null){
			articles = new HashMap<Integer, Article>();
		}		
		articles.put(page, art);
		return this;
	}
	
	public Magazine getMagazine(){
		Magazine mag = createMagazineInstance();
		
		if(info == null || articles == null){
			throw new IllegalStateException("The magazine was not initialized properly");
		} else {		
		mag.setArticles(articles);
		mag.setInfo(info);
		}
		return mag;
	}
}
