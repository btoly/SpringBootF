package com.example.Whathg_Database.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Whathg_Database.DTO.CertificationDTO;
import com.example.Whathg_Database.DTO.IndividualDTO;
import com.example.Whathg_Database.Mapper_Imalmation.CertificationLMP;
import com.example.Whathg_Database.Mapper_Imalmation.CompanyLMP;
import com.example.Whathg_Database.Mapper_Imalmation.IndivdualMappelamp;
import com.example.Whathg_Database.model.Certification;
import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.repository.CertificationRepository;
import com.example.Whathg_Database.repository.CompanyRepository;
import com.example.Whathg_Database.repository.IndividualsRepository;

@Service
public class CertificationService {

@Autowired
CertificationRepository certificationRepository;
private static final CertificationLMP certificationLMP = new CertificationLMP();

	
}
