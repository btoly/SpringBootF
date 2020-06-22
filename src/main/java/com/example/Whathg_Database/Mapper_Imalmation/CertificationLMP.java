package com.example.Whathg_Database.Mapper_Imalmation;

import org.modelmapper.ModelMapper;

import com.example.Whathg_Database.DTO.CertificationDTO;
import com.example.Whathg_Database.Mapper.CertificationMAPPER;
import com.example.Whathg_Database.model.Certification;

public class CertificationLMP implements CertificationMAPPER{

	

ModelMapper modelMapper;

public CertificationLMP() {
	modelMapper = new ModelMapper();
}
	@Override
	public Certification dtoToDomain(CertificationDTO certification) {
		return modelMapper.map(certification,Certification.class );
		
	}

	@Override
	public CertificationDTO domainToDto(Certification certification) {
		return modelMapper.map(certification,CertificationDTO.class );
	}
	
	
	

}
