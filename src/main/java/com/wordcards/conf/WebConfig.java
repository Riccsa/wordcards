package com.wordcards.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig implements WebMvcConfigurer{

//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		// TODO Auto-generated method stub
//		WebMvcConfigurer.super.addViewControllers(registry);
////		registry.addViewController("/login").setViewName("auth/login");
////		registry.addViewController("/card").setViewName("user/card");
////		registry.addViewController("/cards").setViewName("user/cardlist");
////		registry.addViewController("/index").setViewName("user/index");
////		registry.addViewController("/language").setViewName("user/languages");
////		registry.addViewController("/themes").setViewName("user/themes");
////		
////	   registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//	}
//	
	
	

}
