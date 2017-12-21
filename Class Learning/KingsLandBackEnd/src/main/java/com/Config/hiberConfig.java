package com.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class hiberConfig {
	
	public DataSource getH2Data() {
		
		DriverManagerDataSource dsource = new DriverManagerDataSource();
		
		dsource.setDriverClassName("org.h2.Driver");
		dsource.setUrl("jdbc:h2:tcp://localhost/~/180251");
		dsource.setUsername("niit");
		dsource.setPassword("1234");
		System.out.println("H2 Connected");
		return dsource;
	}
	
	private Properties getHiber()
	{
		Properties p = new Properties();
		p.put("hibernate.dialect", "org.hibernate.dailect.H2dailect");
		p.put("hibernate.hbm2ddl.auto", "update");
		p.put("hibernate.show_sql", "true");
		System.out.println("Table created");
		return p;
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	
	public SessionFactory getHibernateSession(Datasource datasource)
	{
		
	}
	
}
