package com.wordcards.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.wordcards.service.UserService;

public class UserServiceImpl implements UserDetailsService{
	
	
	private UserService userService;
	
	@Autowired
	public UserServiceImpl(UserService userService) {
		this.userService=userService;
	}
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	   User user=userService.getUserByUserName(username);
	   if(user==null) {
		   throw new UsernameNotFoundException("User not found!");
	   }
	   
	   return new UserDetailsImpl(user);
	}

}
