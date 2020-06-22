package com.example.Whathg_Database.Mapper_Imalmation;

import org.modelmapper.ModelMapper;

import com.example.Whathg_Database.DTO.CompanyDTO;
import com.example.Whathg_Database.Mapper.CompanyMAPPER;
import com.example.Whathg_Database.model.Company;

public class CompanyLMP implements  CompanyMAPPER{


ModelMapper modelMapper;

public CompanyLMP() {
	modelMapper = new ModelMapper();
}

	@Override
	public Company dtoToDomain(CompanyDTO company) {
		return modelMapper.map(company,Company.class );
	}

	@Override
	public CompanyDTO domainToDto(Company company) {
		return modelMapper.map(company,CompanyDTO.class );
	}

}
