//package com.example.Whathg_Database.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.Whathg_Database.DTO.IndividualDTO;
//import com.example.Whathg_Database.DTO.RecommendationDTO;
//import com.example.Whathg_Database.Mapper_Imalmation.IndivdualMappelamp;
//import com.example.Whathg_Database.Mapper_Imalmation.RecommendationLMP;
//import com.example.Whathg_Database.model.Individual;
//import com.example.Whathg_Database.model.Recommendation;
//import com.example.Whathg_Database.repository.IndividualsRepository;
//import com.example.Whathg_Database.repository.RecommendationRepsitory;
//
//@Service
//public class RecommendationService {
//
//@Autowired
//RecommendationRepsitory recommendationRepsitory;
//private static final RecommendationLMP recommendationLMP = new RecommendationLMP();
//
//
//public RecommendationDTO createRecommendationDTO(RecommendationDTO recommendationDTO) {
//	
//	Recommendation recommendation = Recommendation.builder()
//			.nationalID(recommendationDTO.getNationalID())
//            .recommendation_From(recommendationDTO.getRecommendation_From())
//            .recommendation_Date(recommendationDTO.getRecommendation_Date())
//            .recommendation_AddBy(recommendationDTO.getRecommendation_AddBy())
//            .recommendation_Attach(recommendationDTO.getRecommendation_Attach())
//           
//          
//            .build();
//	
//	Recommendation saveRecommendation = recommendationRepsitory.save(recommendation);
//    return recommendationLMP.domainToDto(saveRecommendation);
//    
//}
//
//}
