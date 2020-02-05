package com.wordcards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordcards.entity.User;
import com.wordcards.entity.Word;
import com.wordcards.repository.WordRepository;

@Service
public class WordService {
	
	private WordRepository wordRepo;

	@Autowired
	public void setWordRepo(WordRepository wordRepo) {
		this.wordRepo = wordRepo;
	}
	
	
	public void add(Word w) {
		wordRepo.save(w);
	}
	
	public List<Word> getWordsByUserId(long userId){	
		return wordRepo.findAllByUserId(userId);
		
	}
	
	public void delete(Word w) {
		wordRepo.delete(w);
	}
	
	public void update(String name) {

	}
	



}
