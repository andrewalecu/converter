package org.dss.pdfcreator.model.document;

import java.util.List;

/**
 * Simple representation of a document.
 *  
 * @author Andrei
 *
 */
public class Document extends DocElement{
    /**
     * The document content is modeled as a list of Paragraphs.
     */
	List<ParagraphElement> doc;

	public List<ParagraphElement> getDoc() {
		return doc;
	}

	public void setDoc(List<ParagraphElement> doc) {
		this.doc = doc;
	}
		
}
