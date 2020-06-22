package com.example.Whathg_Database.model;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.Whathg_Database.model.Individual.IndividualBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity
@Table(name = "language")
public class Language implements Serializable  {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int languge_id;
	 
	 
	   @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	  @JoinColumn(name="NationalID",nullable=false)
	  private Individual NationalID; 
	  
		 
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "languge_name")
	  private String languge_name;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "add_by")
	  private String add_by;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "languge_date")
	  private Timestamp languge_date;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "languge_refrence_no")
	  private long languge_refrence_no;
	  
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "duration_valid")
	  private String duration_valid;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "languge_attach")
	  private String languge_attach;
	  
	  
	  
	  protected Language() {

	  }
	  
	  
	  
	  
	  
	  
	  
	  @Builder



	public Language(int languge_id, Individual nationalID, @NotNull(message = " cannot be Empty ") String languge_name,
			@NotNull(message = " cannot be Empty ") String add_by,
			@NotNull(message = " cannot be Empty ") Timestamp languge_date,
			@NotNull(message = " cannot be Empty ") long languge_refrence_no,
			@NotNull(message = " cannot be Empty ") String duration_valid,
			@NotNull(message = " cannot be Empty ") String languge_attach) {
		super();
		this.languge_id = languge_id;
		NationalID = nationalID;
		this.languge_name = languge_name;
		this.add_by = add_by;
		this.languge_date = languge_date;
		this.languge_refrence_no = languge_refrence_no;
		this.duration_valid = duration_valid;
		this.languge_attach = languge_attach;
	}


	 
	 
}










