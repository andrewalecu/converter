package org.dss.pdfcreator.model.style;

/**
 * Simple representation of a font style.
 * 
 * @author Andrei
 *
 */
public class Style {
	/**
	 * Flag to mark if the font is italic or not.
	 */
	private Boolean italic;
	/**
	 * Flag to mark if the font is bold or not.
	 */
	private Boolean bold;

	/**
	 * The font size
	 */
	private Integer size;

	/**
	 * The name of the font family used.
	 */
	private String fontFamily;

	/**
	 * The hexa numeric representation of the color.
	 */
	private String color;

	public Boolean getItalic() {
		return italic;
	}

	public void setItalic(Boolean italic) {
		this.italic = italic;
	}

	public Boolean getBold() {
		return bold;
	}

	public void setBold(Boolean bold) {
		this.bold = bold;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getFontFamilly() {
		return fontFamily;
	}

	public void setFontFamilly(String fontFamilly) {
		this.fontFamily = fontFamilly;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
