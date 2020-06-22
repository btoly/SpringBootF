package com.example.Whathg_Database.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Whathg_Database.DTO.CompanyDTO;
import com.example.Whathg_Database.Error.ResourceNotFoundException;
import com.example.Whathg_Database.JwtProvider.User;
import com.example.Whathg_Database.JwtProvider.UserRepository;
import com.example.Whathg_Database.model.Certification;
import com.example.Whathg_Database.model.Company;

import com.example.Whathg_Database.repository.CompanyRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth/Company")
public class Company_Contoller {

	@Autowired
	CompanyRepository comRepository;
	@Autowired
	UserRepository userRepository;

	private byte[] bytes;
	
	
	
	

	@DeleteMapping(path = { "/deleteCompany/{id}" })
	public Company deleteCertification(@PathVariable("id") long id) {
		Company com = comRepository.findById(id).get();
		comRepository.deleteById(id);
		return com;
	}

	
	
	
	
	
	
//@GetMapping("/GetCertification")
	@GetMapping("/GetCompany")
	public List<Company> getCompany() {
		return comRepository.findAll();
	}

	@RequestMapping("/getCompany/userId/{id}")
	public List<Company> getCompanyByUserId(@PathVariable("id") String id) {

		List<Company> companyteList = getCompany();
		List<Company> ComList = new ArrayList();
		for (Company company : companyteList) {
			if (id.equals(company.getUsername())) {
				ComList.add(comRepository.findById(company.getId()).get());
			}
		}
		return ComList;
	}

	
	
	
	

	@GetMapping("/getCompany/addBy/{id}")
	@ResponseBody
	public List<Company> getCompanyByUserIdAndAddBy(@PathVariable("id") String id) {

		Optional<User> user = getUserByName(id);

		if (user.isPresent()) {
			User userObj = user.get();
			List<Company> company = comRepository.findByaddby(userObj.getName());

			return company;

		}

		return null;
	}

	@RequestMapping("/User/userName/{name}")
	public Optional<User> getUserByName(@PathVariable String name) {
		return userRepository.findByUsername(name);
	}
	
	
	
	
	
	

	@PostMapping("/addCpmpany")
	public void createaddCpmpany(@RequestBody Company cpmpany) throws IOException {
		cpmpany.setPicByte(this.bytes);
		System.out.println("\n\n\n\n" + cpmpany);
		comRepository.save(cpmpany);
		this.bytes = null;
	}

	@GetMapping("/getcertification")
	public List<Company> getCpmpanyn() {
		return comRepository.findAll();
	}
	
	

	
	@RequestMapping("/userCompany/{username}")
	public Optional<Company> getcompanyByusername(@PathVariable("username") String  username)
	{
		return comRepository.findByUsername(username);
	}
	
	
	
	
	
	
	
	/*
	 * @RequestMapping("/userIdCompany/{id}") public Optional<Company>
	 * getCOmpanyByUserId(@PathVariable("id") long id) { return
	 * comRepository.findById(id); }
	 * 
	 */
	
	
	
	

	@PutMapping("/updateCpmpany")
	public void updateCpmpany(@RequestBody Company cpmpany) {
		comRepository.save(cpmpany);
	}
	
	

	
	

	/*
	 * @RequestMapping("/Certication/{id}") public Optional<User>
	 * getManyeUser(@PathVariable Long id) { return userRepository.findById(id); }
	 * 
	 */

}
