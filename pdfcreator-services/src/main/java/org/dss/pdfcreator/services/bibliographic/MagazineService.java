package org.dss.pdfcreator.services.bibliographic;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.dss.pdfcreator.model.bibliographic.Magazine;
import org.dss.pdfcreator.services.bibliographic.queries.MagazineQueries;
import org.dss.pdfcreator.services.bibliographic.utils.SqlParamFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service("magService")
public class MagazineService implements Manageable<Magazine> {

	private NamedParameterJdbcOperations jdbcTemplate;
	
	@Autowired
	public MagazineService(NamedParameterJdbcOperations template){
		this.jdbcTemplate = template;
	}
	
	public void add(Magazine item) {
		
		SqlParameterSource paramSource = SqlParamFactory.getMagazineAddParams(item);
		PreparedStatementCallback<Object> action = new PreparedStatementCallback<Object>() {

			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {				
				return null;
			}
		};
		jdbcTemplate.execute(MagazineQueries.ADD_ITEM.getQuery(), paramSource, action);
	}

	public void delete(Magazine item) {
		SqlParameterSource paramSource = SqlParamFactory.getMagazineAddParams(item);
		PreparedStatementCallback<Object> action = new PreparedStatementCallback<Object>() {

			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {				
				return null;
			}
		};
		jdbcTemplate.execute(MagazineQueries.DELETE_ITEM.getQuery(), paramSource, action);		
				
	}

	public void update(Magazine item) {
		SqlParameterSource paramSource = SqlParamFactory.getMagazineAddParams(item);
		PreparedStatementCallback<Object> action = new PreparedStatementCallback<Object>() {

			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {				
				return null;
			}
		};
		jdbcTemplate.execute(MagazineQueries.UPDATE_ITEM.getQuery(), paramSource, action);						
	}

	public List<Magazine> list() {
		List<Magazine> queryForList = jdbcTemplate.queryForList(MagazineQueries.SELECT_ALL.getQuery(), new HashMap<String,Object>(), Magazine.class);
		return queryForList;
	}
	
}
