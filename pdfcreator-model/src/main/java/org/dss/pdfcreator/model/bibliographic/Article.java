package org.dss.pdfcreator.model.bibliographic;

import org.dss.pdfcreator.model.document.Document;

/**
 * Article entity.
 * 
 * @author Andrei
 *
 */
public class Article {

	/**
	 * Author of the article
	 */
	private String author;
	
	/**
	 * Title of the article.
	 */
	private String title;
	
	/**
	 * Article content.
	 */
	private Document content;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Document getContent() {
		return content;
	}

	public void setContent(Document content) {
		this.content = content;
	}
		
}
