package com.wordcards.conf;

import javax.management.relation.Role;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.authorizeRequests().antMatchers("/h2_console/**").permitAll()
		.antMatchers("/css/**").permitAll()
		.antMatchers("/images/**").permitAll()
		.antMatchers("/card").hasRole("USER")
		.anyRequest().authenticated()
		.and()
		.csrf().disable()
		.formLogin()
			.loginPage("/login")
			.permitAll()
			.and()
		.logout()
			.logoutSuccessUrl("/login?logout")
			.permitAll();	
		
		 http.csrf().disable();
		 http.headers().frameOptions().disable();
		
	}
 
	
	
}