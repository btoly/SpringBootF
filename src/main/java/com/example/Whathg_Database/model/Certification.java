package com.example.Whathg_Database.model;



import java.io.Serializable;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.Whathg_Database.JwtProvider.User;
import com.example.Whathg_Database.model.Individual.IndividualBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
 
  @Entity
  @Table(name = "Certification")
  public class Certification implements Serializable {


		@Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	  

	 
	  @Column(name = "universityname")
	  private String universityname;

	  @Column(name = "addby")
	  private String addby; 

	  @Column(name = "date")
	 private Timestamp   date;

	  @Column(name = "gap")
		 private int gap ;
	
	  @Column(name = "degree")
		 private String degree;

	  @Column(name = "magor")
		 private String magor;

	

	  
		@NotBlank
		@Size(min = 3, max = 50)
		@Column(name = "username")
		private String username;
	  

public String getUsername() {
			return username;
		}



		public void setUsername(String username) {
			this.username = username;
		}



@ManyToOne
		@JoinColumn(name = "user_id", nullable = false)
private User user;



/*
 * @ManyToOne(fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "user_id", nullable = false)
 * 
 * @JsonIgnore private User user;
 */




@Column(name = "picByte", length = 1000)
private byte[] picByte;


public User getUser() {
	return user;
}



public void setUser(User user) {
	this.user = user;
}



public byte[] getPicByte() {
	return picByte;
}



public void setPicByte(byte[] picByte) {
	this.picByte = picByte;
}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getUniversityname() {
	return universityname;
}



public void setUniversityname(String universityname) {
	this.universityname = universityname;
}



public String getAddby() {
	return addby;
}



public void setAddby(String addby) {
	this.addby = addby;
}



public Timestamp getCERT_DATE() {
	return date;
}



public void setCERT_DATE(Timestamp cERT_DATE) {
	date = cERT_DATE;
}



public int getGap() {
	return gap;
}



public void setGap(int gap) {
	this.gap = gap;
}



public String getDegree() {
	return degree;
}



public void setDegree(String degree) {
	this.degree = degree;
}



public String getMagor() {
	return magor;
}



public void setMagor(String magor) {
	this.magor = magor;
}






public Timestamp getDate() {
	return date;
}



public void setDate(Timestamp date) {
	this.date = date;
}









		
  }