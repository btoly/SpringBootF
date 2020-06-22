package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;

import javax.validation.constraints.Email;

import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.model.User_W;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDTO extends User_W {


	private String CR;
	private String comanyName;

	private Timestamp StartDate;

	private Timestamp EndDate;

	public CompanyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompanyDTO(String email, String phone_number, String address, String password, String CR, String comanyName,
			Timestamp startDate, Timestamp endDate) {
		super(email, phone_number, address, password);
		this.CR = CR;
		this.comanyName = comanyName;
		this.StartDate = startDate;
		this.	EndDate = endDate;
	}

}