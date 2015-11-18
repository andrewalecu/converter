package org.dss.pdfcreator.model.document;

import java.util.List;

/**
 * Simple representation of a paragraph.
 * 
 * @author Andrei
 *
 */
public class ParagraphElement extends DocElement{
	/**
	 * List of words that are contained in the paragraph.
	 */
	private List<WordElement> paragraph;

	public List<WordElement> getParagraph() {
		return paragraph;
	}

	public void setParagraph(List<WordElement> paragraph) {
		this.paragraph = paragraph;
	}
	
}
