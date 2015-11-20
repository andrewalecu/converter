package org.dss.pdfcreator.services.bibliographic.queries;

public enum MagazineQueries {
	SELECT_ALL("SELECT * FROM magazine");
	
	private String query;
	
	MagazineQueries(String query){
		this.query = query;
	}
	
	public String getQuery() {
		return query;
	}
}
