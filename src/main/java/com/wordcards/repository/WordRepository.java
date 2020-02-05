package com.wordcards.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wordcards.entity.Word;

public interface WordRepository extends CrudRepository<Word, Long>{
	
	@Query(value="Select * FROM Word where user_id=?1", nativeQuery=true)
	List<Word> findAllByUserId(Long userId);
	
//	@Modifying
//	@Query(value="insert into word(image_path,name,user_id) values(?1,?2,Select id from user where email=?3)", nativeQuery = true)
//	void saveByUser(String path, String name,String email);

}
