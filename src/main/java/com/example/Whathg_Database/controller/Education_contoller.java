package com.example.Whathg_Database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Whathg_Database.model.Education;
import com.example.Whathg_Database.repository.EducationRepository;
@RestController
public class Education_contoller {


	@Autowired
	//IndividualsRepository repository;
	EducationRepository c;
//	UserRepository repository1;


 @RequestMapping("/aE")
 
 
 
 public String process() {
	 

	//repository.save(new Individual("ebthal@gmail.f","efr","tft","ft",00,"fff","th","fg",242,"hfg","hhgf","hhfg",null,"hff"));

	 
			 c.save(new Education("A","B","C","D","E","F"));


		     return "add ";
		 
 }
 



}