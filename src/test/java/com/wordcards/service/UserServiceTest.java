package com.wordcards.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordcards.entity.User;
import com.wordcards.repository.UserRepository;

@Service
public class UserServiceTest {
	
	private UserRepository userRepo;
     
	@Autowired
	public void setUserRepo(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public User getUserByEmail(String email) {
		init();
		return userRepo.findByEmail(email);
	}
	
	public void add(User user) {
		userRepo.save(user);
	}
	
	private void init() {
		add(new User("Jani","kovács","janikovacs@gmail.com","pass"));		
	}
		

}
