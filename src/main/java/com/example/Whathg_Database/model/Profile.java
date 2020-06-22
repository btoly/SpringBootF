package com.example.Whathg_Database.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.Whathg_Database.JwtProvider.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "profile")
public class Profile {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;
	
	




	@Column(name = "NationalIdentity")
	private Integer NationalIdentity;

	
	@Column(name = "Universitytype")
	private String Universitytype;
	
	
	
	
	@Column(name = "gpa")
	private String gpa;
	
	
	
	@Column(name = "picByte", length = 1000)
	private byte[] picByte;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	


	


	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public Integer getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(Integer nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}

	public String getUniversitytype() {
		return Universitytype;
	}

	public void setUniversitytype(String universitytype) {
		Universitytype = universitytype;
	}

	@JsonBackReference
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getPicByte() {
		return picByte;
	}

	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}
	
	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", NationalIdentity=" + NationalIdentity + ", Universitytype="
				+ Universitytype + ", picByte=" + Arrays.toString(picByte) + ", user=" + user + "]";
	}

	
	
	
	
	
}