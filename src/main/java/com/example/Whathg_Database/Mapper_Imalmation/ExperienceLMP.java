package com.example.Whathg_Database.Mapper_Imalmation;

import org.modelmapper.ModelMapper;

import com.example.Whathg_Database.DTO.ExperienceDTO;
import com.example.Whathg_Database.Mapper.ExperienceMAPPER;
import com.example.Whathg_Database.model.Coures;
import com.example.Whathg_Database.model.Experience;

public class ExperienceLMP  implements ExperienceMAPPER{

	

	
	

ModelMapper modelMapper;

public ExperienceLMP() {
	modelMapper = new ModelMapper();
}
	@Override
	public Experience dtoToDomain(ExperienceDTO experienc) {
		return modelMapper.map(experienc,Experience.class );
	}

	@Override
	public ExperienceDTO domainToDto(Experience experienc) {
		return modelMapper.map(experienc,ExperienceDTO.class );
	}

}
