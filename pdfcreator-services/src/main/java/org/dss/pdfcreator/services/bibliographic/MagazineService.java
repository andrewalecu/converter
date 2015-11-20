package org.dss.pdfcreator.services.bibliographic;

import java.util.HashMap;
import java.util.List;

import org.dss.pdfcreator.model.bibliographic.Magazine;
import org.dss.pdfcreator.services.bibliographic.queries.MagazineQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Service;

@Service("magService")
public class MagazineService implements Manageable<Magazine> {

	private NamedParameterJdbcOperations jdbcTemplate;
	
	@Autowired
	public MagazineService(NamedParameterJdbcOperations template){
		this.jdbcTemplate = template;
	}
	
	public void add(Magazine item) {
		
	}

	public void delete(Magazine item) {
				
	}

	public void update(Magazine item) {
				
	}

	public List<Magazine> list() {
		List<Magazine> queryForList = jdbcTemplate.queryForList(MagazineQueries.SELECT_ALL.getQuery(), new HashMap<String,Object>(), Magazine.class);
		return queryForList;
	}
	
}
