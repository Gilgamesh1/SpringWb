/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.config.jpa;

import com.domain.Alumno;
import java.util.Properties;
import static org.hibernate.cfg.AvailableSettings.C3P0_ACQUIRE_INCREMENT;
import static org.hibernate.cfg.AvailableSettings.C3P0_MAX_SIZE;
import static org.hibernate.cfg.AvailableSettings.C3P0_MAX_STATEMENTS;
import static org.hibernate.cfg.AvailableSettings.C3P0_MIN_SIZE;
import static org.hibernate.cfg.AvailableSettings.C3P0_TIMEOUT;
import static org.hibernate.cfg.AvailableSettings.DRIVER;
import static org.hibernate.cfg.AvailableSettings.HBM2DDL_AUTO;
import static org.hibernate.cfg.AvailableSettings.PASS;
import static org.hibernate.cfg.AvailableSettings.SHOW_SQL;
import static org.hibernate.cfg.AvailableSettings.URL;
import static org.postgresql.jdbc.EscapedFunctions.USER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Raúl
 */
@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = {@ComponentScan("com.domain")})
public class JpaSchool {

    @Autowired
    private Environment env;

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

        Properties props = new Properties();

        // Setting JDBC properties
        props.put(DRIVER, env.getProperty("mysql.driver"));
        props.put(URL, env.getProperty("mysql.jdbcUrl"));
        props.put(USER, env.getProperty("mysql.username"));
        props.put(PASS, env.getProperty("mysql.password"));

        // Setting Hibernate properties
        props.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
        props.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));

        // Setting C3P0 properties
//        props.put(C3P0_MIN_SIZE, env.getProperty("hibernate.c3p0.min_size"));
//        props.put(C3P0_MAX_SIZE, env.getProperty("hibernate.c3p0.max_size"));
//        props.put(C3P0_ACQUIRE_INCREMENT, env.getProperty("hibernate.c3p0.acquire_increment"));
//        props.put(C3P0_TIMEOUT, env.getProperty("hibernate.c3p0.timeout"));
//        props.put(C3P0_MAX_STATEMENTS, env.getProperty("hibernate.c3p0.max_statements"));

        factoryBean.setHibernateProperties(props);
        factoryBean.setAnnotatedClasses(Alumno.class);

        return factoryBean;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(SchoolDataSource());
//        sessionFactory.setPackagesToScan(
//                new String[]{"com.domain"});
//        sessionFactory.setHibernateProperties(hibernateProperties());
//
//        return sessionFactory;
//    }
//
//    @Bean
//    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//        return new PersistenceExceptionTranslationPostProcessor();
//    }
//
//    Properties hibernateProperties() {
//        return new Properties() {
//            {
//        setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//        setProperty("hibernate.show_sql", "true");
//        setProperty("hibernate.current_session_context_class", "thread");
////                setProperty("hibernate.hbm2ddl.auto",
////                        env.getProperty("hibernate.hbm2ddl.auto"));
////                setProperty("hibernate.dialect",
////                        env.getProperty("hibernate.dialect"));
////                setProperty("hibernate.globally_quoted_identifiers",
////                        "true");
//            }
//        };
//    }
//
//    @Bean
//    public DataSource SchoolDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/ColegioWar");
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("r00ts0p0rt3");
//        return dataSource;
//    }

//    @Bean
//    public LocalContainerEntityManagerFactoryBean schoolEntityManager() {
//        LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
//        entityManager.setDataSource(SchoolDataSource());
//        entityManager.setPersistenceUnitName("SchoolUnitName");
//        entityManager.setPackagesToScan("com.domain");
//        entityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//
//        Properties hibernateProperties = new Properties();
//        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//        hibernateProperties.setProperty("hibernate.show_sql", "true");
//        hibernateProperties.setProperty("hibernate.current_session_context_class", "thread");
//        entityManager.setJpaProperties(hibernateProperties);
//        return entityManager;
//    }
//
//    @Bean
//    public PlatformTransactionManager schoolTransactionManager() {
//        JpaTransactionManager TransactionManager = new JpaTransactionManager();
//        TransactionManager.setEntityManagerFactory(schoolEntityManager().getObject());
//        return TransactionManager;
//    }
}
