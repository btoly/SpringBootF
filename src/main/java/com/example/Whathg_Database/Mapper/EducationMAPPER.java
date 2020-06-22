package com.example.Whathg_Database.Mapper;

import com.example.Whathg_Database.DTO.EducationDTO;
import com.example.Whathg_Database.model.Education;

public interface EducationMAPPER {
	

	Education dtoToDomain(final EducationDTO education);

	EducationDTO domainToDto(final Education education );
	
	

}
