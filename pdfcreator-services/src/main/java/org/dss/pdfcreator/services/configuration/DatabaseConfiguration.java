package org.dss.pdfcreator.services.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:/applicationSettings.properties")
public class DatabaseConfiguration {

	@Value("${db.config.url}")
	private String dbUrl;

	@Value("${db.config.driver}")
	private String dbDriver;

	@Value("${db.config.user}")
	private String dbUser;

	@Value("${db.config.password}")
	private String dbPassword;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName(dbDriver);
		driverManagerDataSource.setUrl(dbUrl);
		driverManagerDataSource.setUsername(dbUser);
		driverManagerDataSource.setPassword(dbPassword);
		
		return driverManagerDataSource;
	}

	@Bean(name="template")
	public NamedParameterJdbcTemplate jdbcTemplate(){
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource());
		return template;
	}
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }	
}
