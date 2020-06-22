package com.example.Whathg_Database.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.example.Whathg_Database.model.Individual.IndividualBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
 
//@Entity
@MappedSuperclass
@Table(name = "User_W")

public class User_W {

	 
	
	
	    @Email(message = "Email should be valid")
	  

	 @Column(name = "email", nullable = false, unique=true)
	  private String email;
	    
	   
	//    @Min(value = 10, message = "Phone  number should not be less than 10 ")
	 //  @Max(value = 11, message = "Phone  number should not be greater than 10")
	    
	 @Column(name = "phoneNumber",nullable = false, unique=true)
	  private String phoneNumber;
	    
	    
	
	    
	 @Column(name = "address",nullable = false)
	  private String address;
	
	    
	 @Column(name = "password",nullable = false)
	  private String password;

	 
	 
	 
	public User_W() {
		super();
	}//end User()


	public User_W( String email, String phone_number, String address, String password) {
		super();
		this.email = email;
		this.phoneNumber = phone_number;
		this.address = address;
		this.password = password;
	}
	//end User()


	
	

}// end class