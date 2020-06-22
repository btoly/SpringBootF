//package com.example.Whathg_Database.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.Whathg_Database.DTO.LanguageDTO;
//import com.example.Whathg_Database.Mapper_Imalmation.LanguageLMP;
//import com.example.Whathg_Database.Mapper_Imalmation.RecommendationLMP;
//import com.example.Whathg_Database.model.Language;
//import com.example.Whathg_Database.repository.LanguageRepository;
//import com.example.Whathg_Database.repository.RecommendationRepsitory;
//
//@Service
//public class LanguageService {
//	
//	@Autowired
//	LanguageRepository languageRepository;
//	private static final LanguageLMP languageLMP = new LanguageLMP();
//
//	public LanguageDTO createLanguageDTO(LanguageDTO languageDTO) {
//		
//		Language language = Language.builder()
//				
//				  .nationalID(languageDTO.getNationalID())
//			 
//	            .languge_name(languageDTO.getLanguge_name())
//	            .add_by(languageDTO.getAdd_by())
//	            .languge_date(languageDTO.getLanguge_date())
//	            .languge_refrence_no(languageDTO.getLanguge_refrence_no())
//	            .duration_valid(languageDTO.getDuration_valid())
//	        
//	            .languge_attach(languageDTO.getLanguge_attach())
//	          
//	            .build();
//		
//		Language saveLanguage = languageRepository.save(language);
//	    return languageLMP.domainToDto(saveLanguage);
//	    
//	}
//
//}
