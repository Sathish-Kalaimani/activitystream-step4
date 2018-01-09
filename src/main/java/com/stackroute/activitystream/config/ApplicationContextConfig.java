package com.stackroute.activitystream.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.stackroute.activitystream.aspect.LoggingAspect;

/*This class will contain the application-context for the application. 
 * Define the following annotations:
 * @Configuration - Annotating a class with the @Configuration indicates that the 
 *                  class can be used by the Spring IoC container as a source of 
 *                  bean definitions
 * @ComponentScan - this annotation is used to search for the Spring components amongst the application
 * @EnableWebMvc - Adding this annotation to an @Configuration class imports the Spring MVC 
 * 				   configuration from WebMvcConfigurationSupport 
 * @EnableTransactionManagement - Enables Spring's annotation-driven transaction management capability.
 *                  
 * 
 * */
@EnableAspectJAutoProxy
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan (basePackages ="com.stackroute.activitystream")

public class ApplicationContextConfig {

	/*
	 * Define the bean for DataSource. In our application, we are using MySQL as the dataSource.
	 * To create the DataSource bean, we need to know:
	 * 1. Driver class name
	 * 2. Database URL
	 * 3. Username
	 * 4. Password
	 */
	@Bean (name = "dataSource")
	public DataSource getDataSource() {
		
		
		/*BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/activitystream_step4");
		dataSource.setUsername("root");
		dataSource.setPassword("root");*/
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://" + System.getenv("MYSQL_HOST") + ":3306/" + System.getenv("MYSQL_DATABASE"));
		dataSource.setUsername(System.getenv("MYSQL_USER"));
		dataSource.setPassword(System.getenv("MYSQL_PASSWORD"));
		return dataSource;
	}
	
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		return properties;
	}
	
	/*
	 * Define the bean for SessionFactory. Hibernate SessionFactory is the factory class 
	 * through which we get sessions and perform database operations. 
	 */
	@Bean (name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.scanPackages("com.stackroute.activitystream.model");
		return sessionBuilder.buildSessionFactory();
	}
	
	
	/*
	 * Define the bean for Transaction Manager. HibernateTransactionManager handles transaction 
	 * in Spring. The application that uses single hibernate session factory for database transaction
	 * has good choice to use HibernateTransactionManager. HibernateTransactionManager can work with 
	 * plain JDBC too. HibernateTransactionManager allows bulk update and bulk insert and ensures 
	 * data integrity.   
	 */
	@Bean (name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}

	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setSuffix("/WEB-INF/views/");
		viewResolver.setPrefix(".jsp");
		return viewResolver;
	}
	
	@Autowired
	@Bean (name = "logAspect")
	public LoggingAspect loggingAcpect(){
		return new LoggingAspect();
	}
}
