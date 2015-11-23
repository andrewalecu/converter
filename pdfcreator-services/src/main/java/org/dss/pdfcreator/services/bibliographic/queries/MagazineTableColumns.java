package org.dss.pdfcreator.services.bibliographic.queries;

public enum MagazineTableColumns {
	ID("id"),
	VOLUME_NUMBER("volumeNumber"),
	YEAR_NUMBER("yearNumber"),
	MAG_NUMBER("magNumber"),
	RELEASE_DATE("releaseDate");
	
	private String mapping;
	
	MagazineTableColumns(String column){
		mapping = column;
	}
	
	public String getMapping() {
		return mapping;
	}
}
