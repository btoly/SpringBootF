package com.example.Whathg_Database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Whathg_Database.DTO.EducationDTO;
import com.example.Whathg_Database.Mapper_Imalmation.EducationlLMP;
import com.example.Whathg_Database.Mapper_Imalmation.ExperienceLMP;
import com.example.Whathg_Database.model.Education;
import com.example.Whathg_Database.repository.EducationRepository;
import com.example.Whathg_Database.repository.ExperienceRepository;


@Service
public class EducationService {



@Autowired
EducationRepository educationRepository;
private static final EducationlLMP educationlLMP = new EducationlLMP();


public EducationDTO createIndividualDTO(EducationDTO educationDTO) {
	
	Education education = Education.builder()
			
			
			.email(educationDTO.getEmail())
            .phone_number(educationDTO.getPhoneNumber())
            .address(educationDTO.getAddress())
            .password(educationDTO.getPassword())
            
            
			  .edu_iD(educationDTO.getEdu_iD())
			.eDU_NAME(educationDTO.getEDU_NAME())
          
            
            .build();
	
	Education saveEducationl = educationRepository.save(education);
    return educationlLMP.domainToDto(saveEducationl);
    
}
}
