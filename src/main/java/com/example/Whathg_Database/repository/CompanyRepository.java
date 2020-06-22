package com.example.Whathg_Database.repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Whathg_Database.JwtProvider.User;
import com.example.Whathg_Database.model.Certification;
import com.example.Whathg_Database.model.Company;

@Repository
@Transactional
public interface CompanyRepository extends JpaRepository<Company, Long> {
	@EntityGraph(value = "user.company", type = EntityGraphType.FETCH)
	public List<Company> findByUserId(long id);
	public List<Company> findByaddby(String addby);
	public Optional<Company> findByUsername (String  username) ;


	

}
