package com.wordcards.controller;

import java.util.HashSet;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordcards.entity.User;
import com.wordcards.entity.Word;
import com.wordcards.repository.WordRepository;
import com.wordcards.service.UserService;
import com.wordcards.service.WordService;

import ch.qos.logback.classic.Logger;

@Controller
public class HomeController {
	
private UserService userService;
private WordService wordService;

private final Logger log=(Logger) LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}
	
	 @RequestMapping(value="/login", method=RequestMethod.GET)
	    public String addUser(Model model) {
	       
		  model.addAttribute("user", new User());

	    	return "login";
	    }
	
	  @RequestMapping(value="/index", method = RequestMethod.POST)
	    public String login(@ModelAttribute User user,Model model) {
		  
	     User userFromDB=userService.getUserByEmail(user.getEmail());
	     log.info(userFromDB.getEmail());
	     if(userFromDB!=null) {
	    	 
	    	 log.info(userFromDB.getEmail());
	    	 
	    	model.addAttribute("user", userFromDB);
	    	
	    	 return "index";
	     }

	    	return "login";
	    }
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String login() {
    	return "redirect:login";
    }
    
    @RequestMapping(value="/card", method = RequestMethod.GET)
    public String card() {
    	return "card";
    }
    
    @RequestMapping(value="/cards", method = RequestMethod.GET)
    public String cards() {
    	log.info("hali");
    	return "cardlist";
    }
    
    @RequestMapping(value="/language", method = RequestMethod.GET)
    public String languages() {
    	log.info("hali");
    	return "languages";
    }
    
    @RequestMapping(value="/themes", method = RequestMethod.GET)
    public String themes() {
    	log.info("hali ");
    	return "themes";
    }
    
    @RequestMapping(value="/validation", method = RequestMethod.GET)
    public String validation() {
    	log.info("hali");
    	return "validation";
    }
    
    

	
}
 