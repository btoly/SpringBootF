package com.example.Whathg_Database.model;



import java.io.Serializable;
import java.sql.Timestamp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter


@Entity
@Table(name = "Individual")

public class Individual extends User_W implements Serializable {
	
	
	  private static final long serialVersionUID = -3009157732242241606L;
	  
	  
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name = "NationalID")
	  private String NationalID;
	  
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "firstname")
	  @NotNull(message = " cannot be Empty ")
	  private String firstName;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "MName")
	  private String MName;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "lastname")
	  private String lastName;
	  
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "Gender")
	  private String Gender;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "Status")
	  private String Status;
	  
	  @Column(name = "Skills")
	  private String Skills;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "DOB")
	  private Timestamp DOB;
	  
	  
	  @Column(name = "Attachments")
	  private String Attachments;
	
	  
	  
	
	

	public Individual() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	 @Builder
	public Individual(String email, String phone_number, String address, String password, String nationalID,
			@NotNull(message = " cannot be Empty ") @NotNull(message = " cannot be Empty ") String firstName,
			@NotNull(message = " cannot be Empty ") String mName,
			@NotNull(message = " cannot be Empty ") String lastName,
			@NotNull(message = " cannot be Empty ") String gender,
			@NotNull(message = " cannot be Empty ") String status, String skills,
			@NotNull(message = " cannot be Empty ") Timestamp dOB, String attachments) {
		super(email, phone_number, address, password);
		NationalID = nationalID;
		this.firstName = firstName;
		MName = mName;
		this.lastName = lastName;
		Gender = gender;
		Status = status;
		Skills = skills;
		DOB = dOB;
		Attachments = attachments;
	}


	/*
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 */



	}