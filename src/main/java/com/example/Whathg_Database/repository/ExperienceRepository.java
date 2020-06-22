package com.example.Whathg_Database.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.model.Experience;





@Repository
@Transactional
public interface ExperienceRepository extends CrudRepository<Experience, Long>{

}
