/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.config.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Raúl
 */
@Configuration
@EnableWebMvc
@EnableScheduling
@ComponentScan(basePackages = {"com"})
public class SpringWeb implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver GetInternalResourceViewResolver() {
        InternalResourceViewResolver ViewResolver = new InternalResourceViewResolver();
        ViewResolver.setViewClass(JstlView.class);
        ViewResolver.setPrefix("/WEB-INF/views/");
        ViewResolver.setSuffix(".jsp");
        return ViewResolver;
    }

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setDefaultEncoding("utf-8");
        return resolver;
    }
}
