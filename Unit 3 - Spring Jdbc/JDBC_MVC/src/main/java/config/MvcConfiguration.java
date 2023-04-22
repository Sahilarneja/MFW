package com.Spring.JDBC_MVC.config;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.Spring.JDBC_MVC")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		
		datasource.setUsername("root");
		datasource.setPassword("1012");
		datasource.setUrl("jdbc:mysql://localhost:3306/spring_ncu");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return datasource;
		
	}
	
	@Bean 
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate =new JdbcTemplate(datasource());
		return jdbcTemplate;
	}

	
}
