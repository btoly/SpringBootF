package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;

import javax.validation.constraints.Email;

import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.model.User_W;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationDTO  extends User_W{
	  
	  private String Edu_iD;
	  
	
	  private String EDU_NAME;

	  
	  
	  
	  
	

	
	public EducationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	  
}
