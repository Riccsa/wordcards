package com.wordcards.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wordcards.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	User findByEmail(String email);	
	User findByUserName(String userName);
	List<User> findAll();
}
