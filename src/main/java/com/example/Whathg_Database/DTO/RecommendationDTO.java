package com.example.Whathg_Database.DTO;

import java.sql.Timestamp;

import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Education;
import com.example.Whathg_Database.model.Individual;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class RecommendationDTO {

	

	  private long Recommendation_id;
	  

	  private Individual NationalID; 
	  private Education education; 
	  private Company comanRefence;
	  private String Recommendation_From;
	  
	
	  private Timestamp Recommendation_Date;
	  

	  private String Recommendation_AddBy;
	  

	  private String Recommendation_Attach;


	public RecommendationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RecommendationDTO(long recommendation_id, Individual nationalID, Education education, Company comanRefence,
			String recommendation_From, Timestamp recommendation_Date, String recommendation_AddBy,
			String recommendation_Attach) {
		super();
		Recommendation_id = recommendation_id;
		NationalID = nationalID;
		this.education = education;
		this.comanRefence = comanRefence;
		Recommendation_From = recommendation_From;
		Recommendation_Date = recommendation_Date;
		Recommendation_AddBy = recommendation_AddBy;
		Recommendation_Attach = recommendation_Attach;
	}


	  
	  
}
