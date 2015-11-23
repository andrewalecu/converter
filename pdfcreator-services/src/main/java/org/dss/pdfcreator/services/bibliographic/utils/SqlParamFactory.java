package org.dss.pdfcreator.services.bibliographic.utils;

import org.dss.pdfcreator.model.bibliographic.Magazine;
import org.dss.pdfcreator.services.bibliographic.queries.MagazineTableColumns;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

public class SqlParamFactory {
	public static SqlParameterSource getMagazineAddParams(Magazine item){
		MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
		sqlParameterSource.addValue(MagazineTableColumns.ID.name(), item.getId());
		sqlParameterSource.addValue(MagazineTableColumns.VOLUME_NUMBER.name(), item.getInfo().getVol());
		sqlParameterSource.addValue(MagazineTableColumns.YEAR_NUMBER.name(), item.getInfo().getYear());
		sqlParameterSource.addValue(MagazineTableColumns.MAG_NUMBER.name(), item.getInfo().getNumber());
		sqlParameterSource.addValue(MagazineTableColumns.RELEASE_DATE.name(), item.getInfo().getReleaseDate());
		return sqlParameterSource;
	}  
}	
