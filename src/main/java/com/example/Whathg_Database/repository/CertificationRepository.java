package com.example.Whathg_Database.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.model.Certification;
import com.example.Whathg_Database.model.Company;

@Repository
@Transactional

public interface CertificationRepository extends JpaRepository<Certification, Long> {

	@EntityGraph(value = "user.certification", type = EntityGraphType.FETCH)
	public List<Certification> findByUserId(long id);

	public List<Certification> findByaddby(String addby);
	public List<Certification> findByUsername (String  username) ;


}
