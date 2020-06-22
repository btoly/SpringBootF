package com.example.Whathg_Database.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.model.Individual;


@Repository
@Transactional
public interface IndividualsRepository extends CrudRepository<Individual, Long>{
 
	/*
	 * @Modifying
	 * 
	 * @Query(UPDATE Individual SET Individual.sat = value1, column2 = value2....,
	 * columnN = valueN WHERE [condition];)
	 */
	
	
	
}

