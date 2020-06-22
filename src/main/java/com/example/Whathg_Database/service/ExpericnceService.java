package com.example.Whathg_Database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Whathg_Database.DTO.ExperienceDTO;
import com.example.Whathg_Database.Mapper_Imalmation.ExperienceLMP;
import com.example.Whathg_Database.Mapper_Imalmation.LanguageLMP;
import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Experience;
import com.example.Whathg_Database.repository.ExperienceRepository;
import com.example.Whathg_Database.repository.LanguageRepository;

@Service
public class ExpericnceService {

	
	@Autowired
	ExperienceRepository experienceRepository;
	private static final ExperienceLMP experienceLMP = new ExperienceLMP();

	public ExperienceDTO createExperienceDTO(ExperienceDTO experienceDTO) {
		
		Experience experience = Experience.builder()
				
				 // .exp_id(experienceDTO.getExp_id())
				  
				
				  .comanyRefrence(experienceDTO.getComanyRefrence())
				.edution(experienceDTO. getEdution())
				

				
				  .nationalID(experienceDTO.getNationalID())
			

				//	.comanyname(experienceDTO.getComanyname())
			          
				
				  .e_position(experienceDTO.getE_position())
				.name_company(experienceDTO.getName_company())
	          
				.s_date(experienceDTO.getS_date())
				.e_date(experienceDTO.getE_date())
				.e_date(experienceDTO.getE_date())
				.add_by(experienceDTO.getAdd_by())
				.ref_name(experienceDTO.getRef_name())
				.ref_email(experienceDTO.getRef_email())
	            .build();
		
		Experience saveExperience = experienceRepository.save(experience);
	    return experienceLMP.domainToDto(saveExperience);
	    
	}
	
}
