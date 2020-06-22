package com.example.Whathg_Database.Mapper;

import com.example.Whathg_Database.DTO.CertificationDTO;
import com.example.Whathg_Database.model.Certification;

public interface CertificationMAPPER {


	Certification dtoToDomain(final    CertificationDTO certification );

	CertificationDTO domainToDto(final Certification certification);
	
	
}
