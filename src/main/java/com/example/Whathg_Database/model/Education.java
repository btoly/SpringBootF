package com.example.Whathg_Database.model;



import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.Whathg_Database.model.Individual.IndividualBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "Education")
public class Education extends User_W  implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;

	

 
 
	  @Id
	  @Column(name = "Edu_iD",unique=true)
	  private String Edu_iD;
	  
	  @NotNull
	  @Column(name = "EDU_NAME")
	  private String EDU_NAME;




	  @Builder
	public Education(String email, String phone_number, String address, String password, String edu_iD,
			String eDU_NAME) {
		super(email, phone_number, address, password);
		Edu_iD = edu_iD;
		EDU_NAME = eDU_NAME;
	}

	

	

	
		 
	  }