package com.example.Whathg_Database.Mapper;

import com.example.Whathg_Database.DTO.LanguageDTO;
import com.example.Whathg_Database.model.Language;

public interface LanguageMAPPER {
	
	Language dtoToDomain(final LanguageDTO LLanguage );

	LanguageDTO domainToDto(final Language LLanguage );
	

}
