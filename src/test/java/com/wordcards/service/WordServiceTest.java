package com.wordcards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordcards.entity.User;
import com.wordcards.entity.Word;
import com.wordcards.repository.WordRepository;

@Service
public class WordServiceTest {
	
	private WordRepository wordRepo;

	@Autowired
	public void setWordRepo(WordRepository wordRepo) {
		this.wordRepo = wordRepo;
	}
	
	
	public void addWord(Word w) {
		wordRepo.save(w);
	}
	
	public List<Word> getWordsByUserId(long userId){
        init();		
		return wordRepo.findAllByUserId(userId);
		
	}
	
	private void init() {
//		add(new Word("kartya1", "elérés1"),new User());
//		add(new Word("kartya2", "elérés2"), new User());
//		add(new Word("kartya3", "elérés3"), new User());
	}


}
