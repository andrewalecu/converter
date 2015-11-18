package org.dss.pdfcreator.model.bibliographic;

import java.util.HashMap;
import java.util.Map;

public class Magazine {
	/**
	 * List of articles 
	 */
	private Map<Integer, Article> articles;
	
	/**
	 * Bibliographic information 
	 */
	private BibliographicInfo info;

	public Map<Integer, Article> getArticles() {
		return articles;
	}

	public void setArticles(Map<Integer, Article> articles) {
		this.articles = articles;
	}

	public BibliographicInfo getInfo() {
		return info;
	}

	public void setInfo(BibliographicInfo info) {
		this.info = info;
	}
	
	
	public Magazine(){
		articles = new HashMap<Integer, Article>();
	}

	public Magazine(Map<Integer, Article> articles, BibliographicInfo info) {
		super();
		this.articles = articles;
		this.info = info;
	}
	
	
}
