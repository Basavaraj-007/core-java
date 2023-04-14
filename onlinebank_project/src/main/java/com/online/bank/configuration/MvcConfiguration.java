package com.online.bank.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.online")
public class MvcConfiguration implements WebMvcConfigurer  {

	public MvcConfiguration() {
	System.out.println("-------MVC Config created-------");
	}
	
	@Bean
	public ViewResolver setupResolver() {
		System.out.println("-----setupResolver created------");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("--addResourceHandlers--------------");
	    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
}
