package com.example.Whathg_Database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Whathg_Database.DTO.IndividualDTO;
import com.example.Whathg_Database.Mapper_Imalmation.IndivdualMappelamp;
import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.repository.CertificationRepository;
import com.example.Whathg_Database.repository.IndividualsRepository;


@Service
public class IndividualService {

	/*
	 * private IndividualsRepository individualRepository; private
	 * IndivdualMappelamp individualMapper;
	 */


@Autowired
IndividualsRepository individualRepository;
private static final IndivdualMappelamp individualMapper = new IndivdualMappelamp();






public IndividualDTO createIndividualDTO(IndividualDTO individualDTO) {
	
	Individual individual = Individual.builder()
			.email(individualDTO.getEmail())
            .phone_number(individualDTO.getPhoneNumber())
            .address(individualDTO.getAddress())
            .password(individualDTO.getPassword())
            
            .nationalID(individualDTO.getNationalID())
            .firstName(individualDTO.getFName())
            .mName(individualDTO.getMName())
            .lastName(individualDTO.getLName())
            .gender(individualDTO.getGender())
            .status(individualDTO.getStatus())
            .skills(individualDTO.getSkills())
            .dOB(individualDTO.getDateOfBirth())
            .attachments(individualDTO.getAttachments())
            
            .build();
	

    
	Individual saveIndividual = individualRepository.save(individual);
    return individualMapper.domainToDto(saveIndividual);
    
    
    
}


}