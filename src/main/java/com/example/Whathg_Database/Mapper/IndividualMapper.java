package com.example.Whathg_Database.Mapper;



import com.example.Whathg_Database.DTO.IndividualDTO;
import com.example.Whathg_Database.model.Individual;


//(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel= "spring")
public interface IndividualMapper {


	Individual dtoToDomain(final IndividualDTO individual );

	IndividualDTO domainToDto(final Individual individual );
	
	

	
	

}