package org.dss.pdfcreator.model.bibliographic;

import java.util.HashMap;
import java.util.Map;

public class Magazine {
	
	/**
	 * Surrogate primary key
	 */
	public Integer id;
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
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Magazine(){
		articles = new HashMap<Integer, Article>();
	}

	public Magazine(Integer id, Map<Integer, Article> articles, BibliographicInfo info) {
		super();
		this.id = id;
		this.articles = articles;
		this.info = info;
	}
	
	
}
