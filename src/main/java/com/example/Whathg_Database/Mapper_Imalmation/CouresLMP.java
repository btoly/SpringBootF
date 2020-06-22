package com.example.Whathg_Database.Mapper_Imalmation;

import org.modelmapper.ModelMapper;

import com.example.Whathg_Database.DTO.CouresDTO;
import com.example.Whathg_Database.Mapper.CouresMAPPER;
import com.example.Whathg_Database.model.Coures;

public class CouresLMP implements  CouresMAPPER{

	
	

ModelMapper modelMapper;

public CouresLMP() {
	modelMapper = new ModelMapper();
}

	@Override
	public Coures dtoToDomain(CouresDTO coures) {
		return modelMapper.map(coures,Coures.class );
	}

	@Override
	public CouresDTO domainToDto(Coures coures) {
		return modelMapper.map(coures,CouresDTO.class );
	}

}
