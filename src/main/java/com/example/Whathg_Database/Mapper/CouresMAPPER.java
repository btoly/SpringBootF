package com.example.Whathg_Database.Mapper;

import com.example.Whathg_Database.DTO.CouresDTO;
import com.example.Whathg_Database.model.Coures;

public interface CouresMAPPER {


	Coures dtoToDomain(final CouresDTO coures );

	CouresDTO domainToDto(final Coures coures );
}
