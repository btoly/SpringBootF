package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;

import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Education;
import com.example.Whathg_Database.model.Individual;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class ExperienceDTO {
	
private long  Exp_id;

	private String e_position;
	 private Individual NationalID; 

    private String name_company;

    private Company comanyRefrence; 
    private Timestamp s_date;
    private Education edution; 
    private Timestamp e_date;

    private Company Comanyname; 
    private String add_by;
   
    
    private String ref_name;

    
    private String ref_email;


	public ExperienceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ExperienceDTO(long exp_id, String e_position, Individual nationalID, String name_company,
			Company comanyRefrence, Timestamp s_date, Education edution, Timestamp e_date, Company comanyname,
			String add_by, String ref_name, String ref_email) {
		super();
		Exp_id = exp_id;
		this.e_position = e_position;
		NationalID = nationalID;
		this.name_company = name_company;
		this.comanyRefrence = comanyRefrence;
		this.s_date = s_date;
		this.edution = edution;
		this.e_date = e_date;
		Comanyname = comanyname;
		this.add_by = add_by;
		this.ref_name = ref_name;
		this.ref_email = ref_email;
	}


    
    
}
