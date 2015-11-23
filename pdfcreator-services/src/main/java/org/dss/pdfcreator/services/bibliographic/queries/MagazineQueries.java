package org.dss.pdfcreator.services.bibliographic.queries;

public enum MagazineQueries {
	SELECT_ALL("SELECT * FROM magazine"),
	ADD_ITEM("insert into MAGAZINE(volumeNumber,yearNumber,magNumber,releaseDate) values (?,?,?,?)"),
	DELETE_ITEM("delete from MAGAZINE where id = ?"),
	UPDATE_ITEM("update MAGAZINE set volumeNumber=?, yearNumber=?, magNumber=?, releaseDate=?");
	
	private String query;
	
	MagazineQueries(String query){
		this.query = query;
	}
	
	public String getQuery() {
		return query;
	}
}
