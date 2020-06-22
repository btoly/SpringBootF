package com.example.Whathg_Database.Mapper;

import com.example.Whathg_Database.DTO.CompanyDTO;
import com.example.Whathg_Database.model.Company;

public interface CompanyMAPPER {


	

	Company dtoToDomain(final CompanyDTO company);

	CompanyDTO domainToDto(final Company company );
	
	

	
}
