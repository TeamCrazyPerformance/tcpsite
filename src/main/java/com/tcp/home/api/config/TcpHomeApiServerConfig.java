package com.tcp.home.api.config;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.querydsl.jpa.impl.JPAQueryFactory;

@Configuration
@ComponentScan(basePackages = { "com.tcp.home.api"})
@EnableTransactionManagement
@EnableWebMvc
@EnableJpaRepositories(basePackages = {"com.tcp.home.api.repository"})
public class TcpHomeApiServerConfig extends WebMvcConfigurerAdapter{
    private final Logger LOG = Logger.getLogger(TcpHomeApiServerConfig.class);
    
    
    public String activeProfile = System.getProperty("spring.profiles.active");
    
    
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));

        MappingJackson2HttpMessageConverter jackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        jackson2HttpMessageConverter.setPrettyPrint(true);
        converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));

        List<MediaType> mediaTypeList = new ArrayList<MediaType>();
        mediaTypeList.add(MediaType.valueOf("text/html;charset=UTF-8"));
        mediaTypeList.add(MediaType.valueOf("application/json;charset=UTF-8"));
        mediaTypeList.add(MediaType.valueOf("application/v1+json;charset=UTF-8"));

        jackson2HttpMessageConverter.setSupportedMediaTypes(mediaTypeList);
        converters.add(jackson2HttpMessageConverter);
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
    
    /***
     * Making PropertySourcePlaceholderConfigurer with specific properties
     * files.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer PropertySourcesPlaceholderConfigurer(
            org.springframework.core.env.Environment env) {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendarAdapter = new HibernateJpaVendorAdapter();
        jpaVendarAdapter.setDatabase(Database.MYSQL);

        return jpaVendarAdapter;
    }
    
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean lemfb = new LocalContainerEntityManagerFactoryBean();
        lemfb.setDataSource(dataSource);
        lemfb.setJpaVendorAdapter(jpaVendorAdapter());
        lemfb.setPackagesToScan("com.tcp.home.api.domain");
        lemfb.setJpaProperties(additionalHibernateProperties());
        return lemfb;
    }
    
    protected Properties additionalHibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
        properties.setProperty("hibernate.show_sql", "false");
        return properties;
    }
    
    @Bean
    public JPAQueryFactory queryFactory(EntityManager entityManager) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        return queryFactory;
    }
}
