package com.wordcards.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Word {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Id
	private long id;
	private String name;
	private String imagePath;

	@ManyToOne
	private User user;
	
	public Word(String name, String imagePath, User user) {
		this.name=name;
		this.imagePath=imagePath;
		this.user=user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getId() {
		return id;
	}	
	
	

}
