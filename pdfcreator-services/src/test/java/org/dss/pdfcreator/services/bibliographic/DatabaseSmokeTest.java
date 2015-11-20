package org.dss.pdfcreator.services.bibliographic;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.dss.pdfcreator.services.configuration.DatabaseConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={DatabaseConfiguration.class})
public class DatabaseSmokeTest {
	@Autowired
	NamedParameterJdbcOperations template;
	
	enum SmokeTestQuery{
		SELECT_COUNT_MAGAZINE("SELECT count(*) as count FROM magazine");
		
		private String query;
		
		private SmokeTestQuery(String query) {
			this.query = query;
		}
		
		public String getQuery() {
			return query;
		}
	}
	
	@Test
	public void connectionSmokeTest(){
		List<Integer> queryResult = template.query(SmokeTestQuery.SELECT_COUNT_MAGAZINE.getQuery(), new RowMapper<Integer>() {

			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				int result = rs.getInt("count");
				return result;
			}
		});
		
		assertNotNull("The query was not executed", queryResult);
	}
	
}
