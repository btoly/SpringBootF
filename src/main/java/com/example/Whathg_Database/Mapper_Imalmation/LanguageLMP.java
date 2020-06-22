package com.example.Whathg_Database.Mapper_Imalmation;

import org.modelmapper.ModelMapper;

import com.example.Whathg_Database.DTO.LanguageDTO;
import com.example.Whathg_Database.Mapper.LanguageMAPPER;
import com.example.Whathg_Database.model.Coures;
import com.example.Whathg_Database.model.Language;

public class LanguageLMP implements LanguageMAPPER {

	

ModelMapper modelMapper;

public LanguageLMP() {
	modelMapper = new ModelMapper();
}
	
	
	
	
	@Override
	public Language dtoToDomain(LanguageDTO LLanguage) {
		return modelMapper.map(LLanguage,Language.class );
	}

	@Override
	public LanguageDTO domainToDto(Language LLanguage) {
		return modelMapper.map(LLanguage,LanguageDTO.class );
	}

}
