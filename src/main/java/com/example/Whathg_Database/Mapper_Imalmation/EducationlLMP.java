package com.example.Whathg_Database.Mapper_Imalmation;

import org.modelmapper.ModelMapper;

import com.example.Whathg_Database.DTO.EducationDTO;
import com.example.Whathg_Database.Mapper.EducationMAPPER;
import com.example.Whathg_Database.model.Education;

public class EducationlLMP implements  EducationMAPPER{

	
	


ModelMapper modelMapper;

public EducationlLMP() {
	modelMapper = new ModelMapper();
}


	@Override
	public Education dtoToDomain(EducationDTO education) {
		return modelMapper.map(education,Education.class );
	}

	@Override
	public EducationDTO domainToDto(Education education) {
		return modelMapper.map(education,EducationDTO.class );
	}

}
