package com.wordcards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordcards.entity.User;
import com.wordcards.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepo;
     
	@Autowired
	public void setUserRepo(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User getUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	public User getUserByUserName(String userName) {
		return userRepo.findByUserName(userName);
	}
	
	public User saveOrUpdate(User user) {
		
		return userRepo.save(user);
	}
	
}
