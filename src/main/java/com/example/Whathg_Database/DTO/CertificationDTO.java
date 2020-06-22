package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;

import com.example.Whathg_Database.model.Individual;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class CertificationDTO {



	private String CERT_id;
	private Individual NationalID; 
	private String UNI_NAME;//اسم الجامعه
	private String ADDBY; // مين يضي  الشهاده 
	private Timestamp   CERT_DATE;	  
	private int GPA ;
	private String DEGREE;
	private String MAJOR;
	private String ATTACH;

	
	
	
	
	public CertificationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}






}
