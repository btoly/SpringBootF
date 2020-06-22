package com.example.Whathg_Database.repository;



import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.model.Education;


@Repository
@Transactional
public interface EducationRepository extends CrudRepository<Education, String>{

}
