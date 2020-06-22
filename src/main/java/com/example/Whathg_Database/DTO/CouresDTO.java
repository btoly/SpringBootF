package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;

import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Education;
import com.example.Whathg_Database.model.Individual;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class CouresDTO {
	
	   private Individual NationalID;
	   private Education edution; 
	   private Company comanyRefrence; 
	  private String courseID;
	  private String nameCourse;
	  private String addedBy;
	  private String nameInstittion;
	  private String courseAttch;
	  
	
		  private Timestamp  startDate;
		  
	
		  private Timestamp endDate;


		public CouresDTO() {
			super();
			// TODO Auto-generated constructor stub
		}


		public CouresDTO(Individual nationalID, Education edution, Company comanyRefrence, String courseID,
				String nameCourse, String addedBy, String nameInstittion, String courseAttch, Timestamp startDate,
				Timestamp endDate) {
			super();
			NationalID = nationalID;
			this.edution = edution;
			this.comanyRefrence = comanyRefrence;
			this.courseID = courseID;
			this.nameCourse = nameCourse;
			this.addedBy = addedBy;
			this.nameInstittion = nameInstittion;
			this.courseAttch = courseAttch;
			this.startDate = startDate;
			this.endDate = endDate;
		}


		  
	  
}
