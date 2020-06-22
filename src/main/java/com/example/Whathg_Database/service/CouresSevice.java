package com.example.Whathg_Database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Whathg_Database.DTO.CouresDTO;
import com.example.Whathg_Database.Mapper_Imalmation.CouresLMP;
import com.example.Whathg_Database.Mapper_Imalmation.EducationlLMP;
import com.example.Whathg_Database.model.Coures;
import com.example.Whathg_Database.repository.CouresRepositoy;
import com.example.Whathg_Database.repository.EducationRepository;


@Service
public class CouresSevice {


@Autowired
CouresRepositoy couresRepositoy;
private static final CouresLMP couresLMP = new CouresLMP();

public CouresDTO createCouresDTO(CouresDTO couresDTO) {
	
	Coures coures = Coures.builder()
			.nationalID(couresDTO. getNationalID())
			.comanyRefrence(couresDTO. getComanyRefrence())
			.edution(couresDTO. getEdution())
			
			.courseID(couresDTO. getCourseID())
			
            .nameCourse(couresDTO.getAddedBy())
            .addedBy(couresDTO.getAddedBy())
            .nameInstittion(couresDTO.getNameInstittion())
            .courseAttch(couresDTO.getCourseAttch())
            .startDate(couresDTO.getStartDate())
            .endDate(couresDTO.getEndDate())
            
            
            .build();
	
	Coures saveCoures = couresRepositoy.save(coures);
    return couresLMP.domainToDto(saveCoures);
    
}
	
	
	
}
