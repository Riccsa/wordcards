package com.wordcards.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

import lombok.Data;


@Entity
public class User {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private long id;
	@NotBlank
	private String role;
	@NotBlank(message = "Firstname cannot be blank")
	private String firstName;
	@NotBlank
	private String lastName;
	@NotBlank
	private String userName;
	@NotBlank
	private String email;
	@NotBlank
	private String password;
	@OneToMany(mappedBy = "user")
	private List<Word> wordList;
	
	
	
	
	public User() {
		
	}

	public User(String firstName, String lastName, String email, String password) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
	}
	
	public User(String firstName, String lastName, String email,String password, List<Word> wordList) {
		this(firstName,lastName,email, password);
		this.wordList=wordList;
	}

	public long getId() {
		return id;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Word> getWordList() {
		return wordList;
	}

	public void setWordList(List<Word> wordList) {
		this.wordList = wordList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	


	
	

}
