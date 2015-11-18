package org.dss.pdfcreator.model.bibliographic;

import java.util.Date;

/**
 * Simple version of a bibliographic information structure.
 * 
 * @author Andrei
 *
 */
public class BibliographicInfo {
	/**
	 * Volume number
	 */
	private Number vol;
	/**
	 * Year number
	 */
	private Number year;
	/**
	 * Magazine number
	 */
	private Number number;
	/**
	 * Magazine number release date.
	 */
	private Date releaseDate;
	public Number getVol() {
		return vol;
	}
	public void setVol(Number vol) {
		this.vol = vol;
	}
	public Number getYear() {
		return year;
	}
	public void setYear(Number year) {
		this.year = year;
	}
	public Number getNumber() {
		return number;
	}
	public void setNumber(Number number) {
		this.number = number;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
