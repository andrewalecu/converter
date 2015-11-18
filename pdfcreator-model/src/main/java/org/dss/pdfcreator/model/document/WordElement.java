package org.dss.pdfcreator.model.document;

/**
 * Simple representation of the smallest part of a document, the word.
 * </br>
 * In version 0.0.1 it is not possible to have different styles of word letters.
 * 
 * @author Andrei
 *
 */
public class WordElement extends DocElement {
	/**
	 * The string that represents the word.
	 */
	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
		
}
