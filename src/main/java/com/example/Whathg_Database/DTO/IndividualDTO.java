package com.example.Whathg_Database.DTO;




import java.sql.Timestamp;

import javax.validation.constraints.Email;

import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.model.User_W;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndividualDTO extends User_W {
	
	
	
	  private String NationalID;
	


	private String fName;

	private String mName;

	private String lName;

	private String gender;

	private String status;

	private String skills;

	private Timestamp dateOfBirth;

	private String attachments;





	public IndividualDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	






	public IndividualDTO(String email, String phone_number, String address, String password, String nationalID,
			String fName, String mName, String lName, String gender, String status, String skills,
			Timestamp dateOfBirth, String attachments) {
		super(email, phone_number, address, password);
		NationalID = nationalID;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.gender = gender;
		this.status = status;
		this.skills = skills;
		this.dateOfBirth = dateOfBirth;
		this.attachments = attachments;
	}






	
}

