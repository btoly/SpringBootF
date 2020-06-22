package com.example.Whathg_Database.Mapper;

import com.example.Whathg_Database.DTO.ExperienceDTO;
import com.example.Whathg_Database.model.Experience;

public interface ExperienceMAPPER {
	
	
	Experience dtoToDomain(final ExperienceDTO experienc);

	ExperienceDTO domainToDto(final Experience experienc );
	
	

}
