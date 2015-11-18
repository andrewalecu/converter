package org.dss.pdfcreator.model.document;

import org.dss.pdfcreator.model.style.Style;

/**
 * Abstract class that holds all the common parts of a document element.
 * 
 * @author Andrei
 *
 */
public abstract class DocElement {
	/**
	 * Simplified version of a Font specification.
	 */
	private Style style;

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}
	
}
