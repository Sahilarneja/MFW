package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
public class jdbcConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DataSource ds=new DriverManagerDataSource();
		((DriverManagerDataSource) ds).setDriverClassName("com.mysql.jdbc.Driver");
		((AbstractDriverBasedDataSource) ds).setUrl("jdbc:mysql://LocalHost:3306/springjdbc");
		((AbstractDriverBasedDataSource) ds).setUsername("root");
		((AbstractDriverBasedDataSource) ds).setPassword("1012");
		return ds;
		
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate(){
		JdbcTemplate jdbcTemplate =new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		StudentDao studentDao=new StudentDaoImpl();
		((StudentDaoImpl) studentDao).setJdbcTemplate(getTemplate());
		return studentDao;
		
	}
}
