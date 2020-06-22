package com.example.Whathg_Database.Mapper_Imalmation;

import org.modelmapper.ModelMapper;

import com.example.Whathg_Database.DTO.IndividualDTO;
import com.example.Whathg_Database.Mapper.IndividualMapper;
import com.example.Whathg_Database.model.Individual;

/*public class IndivdualMappelamp {

}
*/


public class IndivdualMappelamp implements IndividualMapper{



ModelMapper modelMapper;

public IndivdualMappelamp() {
	modelMapper = new ModelMapper();
}

@Override
public  Individual dtoToDomain(IndividualDTO individual) {
	return modelMapper.map(individual,Individual.class );

}


@Override
public  IndividualDTO domainToDto(Individual individual) {
	return modelMapper.map(individual,IndividualDTO.class );


}

}