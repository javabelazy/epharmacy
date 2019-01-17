/**
 *  Hibernate Configuration class
 */
package com.etrade.expenses;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate4.HibernateTransactionManager;
//import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author proximotech
 *
 */
@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {
	
	@Value("${db.driver}")
	private String DRIVER;
	
	@Value("${db.username}")
	private String USERNAME;
	
	@Value("${db.password}")
	private String PASSWORD;
	
	@Value("${db.url}")
	private String URL;
	
	@Value("${hibernate.dialect}")
	private String DIALECT;
	
	@Value("${hibernate.show_sql}")
	private String SHOW_SQL;
	
	@Value("${hibernate.hbm2ddl.auto}")
	private String HBM2DDL_AUTO;
	
	@Value("${entitymanager.packagesToScan}")
	private String PACKAGE_TO_SCAN;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setPassword(PASSWORD);
		dataSource.setUsername(USERNAME);
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(PACKAGE_TO_SCAN);
		
		Properties properties = new Properties();
		properties.put("hibernate.dialect", DIALECT);
		properties.put("hibernate.show_sql", SHOW_SQL);
		properties.put("hibernate.hbm2ddl.auto", HBM2DDL_AUTO);
		sessionFactory.setHibernateProperties(properties);
		
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

}
