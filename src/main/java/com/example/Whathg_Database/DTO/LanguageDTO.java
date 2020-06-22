package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;

import com.example.Whathg_Database.model.Individual;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class LanguageDTO {
	
	  private Individual NationalID; 
	
	private int languge_id;
	 
	 
	  private String languge_name;
	 

	  private String add_by;
	  
	  private Timestamp languge_date;
	  
	  private long languge_refrence_no;
	  
	  
	  private String duration_valid;
	  
		  private String languge_attach;

		public LanguageDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public LanguageDTO(Individual nationalID, int languge_id, String languge_name, String add_by,
				Timestamp languge_date, long languge_refrence_no, String duration_valid, String languge_attach) {
			super();
			NationalID = nationalID;
			this.languge_id = languge_id;
			this.languge_name = languge_name;
			this.add_by = add_by;
			this.languge_date = languge_date;
			this.languge_refrence_no = languge_refrence_no;
			this.duration_valid = duration_valid;
			this.languge_attach = languge_attach;
		}


}
