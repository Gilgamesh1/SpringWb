/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.config.jpa;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Raúl
 */
@Configuration
@EnableTransactionManagement
public class JpaSchool {

    @Bean
    public DataSource SchoolDataSource() {
        DriverManagerDataSource DataSource = new DriverManagerDataSource();
        DataSource.setDriverClassName("org.postgresql.Driver");
        DataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/ColegioWar");
        DataSource.setUsername("postgres");
        DataSource.setPassword("r00ts0p0rt3");
        return DataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean SchoolEntityManager() {
        LocalContainerEntityManagerFactoryBean EntityManager = new LocalContainerEntityManagerFactoryBean();
        EntityManager.setDataSource(SchoolDataSource());
        EntityManager.setPersistenceUnitName("SchoolUnitName");
        EntityManager.setPackagesToScan("com.domain");
        EntityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        Properties HibernateProperties = new Properties();
        HibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        HibernateProperties.setProperty("hibernate.show_sql", "true");
        HibernateProperties.setProperty("hibernate.current_session_context_class", "thread");
        EntityManager.setJpaProperties(HibernateProperties);
        return EntityManager;
    }

    @Bean
    public PlatformTransactionManager SchoolTransactionManager() {
        JpaTransactionManager TransactionManager = new JpaTransactionManager();
        TransactionManager.setEntityManagerFactory(SchoolEntityManager().getObject());
        return TransactionManager;
    }
}
