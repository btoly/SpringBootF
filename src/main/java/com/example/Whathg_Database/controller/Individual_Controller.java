package com.example.Whathg_Database.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Whathg_Database.DTO.IndividualDTO;
import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Individual;
import com.example.Whathg_Database.repository.CompanyRepository;
import com.example.Whathg_Database.repository.IndividualsRepository;
import com.example.Whathg_Database.service.IndividualService;

//import com.example.TestDB.repository.CustomerRepository;

//@ComponentScan("com.example.TestDB.repository")
@SpringBootApplication
@RestController
@EnableAutoConfiguration

@Controller
public class Individual_Controller {

	
	@Autowired
	
	IndividualService individualService;
	
	IndividualDTO individualDTO =new IndividualDTO("ebthal@fhgmail.f", "05", "Riadh", "1234", "11111", "Ebthal", "Mohamed", "Alessa", "F", "S", "Spring bppt"
			,Timestamp.valueOf("2019-11-12 02:02:03.123456789"),"Attch");
	
	
	
	
	@RequestMapping("/ADDIndividual")

	public String process() {

		individualService.createIndividualDTO(individualDTO);

		return "add";

	}
	
	
	
	
	
	
	

	/*
	 * @RequestMapping("/udate")
	 * 
	 * 
	 * 
	 * public String udate() {
	 * 
	 * 
	 * repository.Uddate("9","s");
	 * 
	 * return "udate ";
	 * 
	 * 
	 * }
	 */

}

/*
 * public String process(){ repository.save(new Customer("ebthal", "alessa"));
 * repository.save(new Customer("Adam", "Johnson")); repository.save(new
 * Customer("Kim", "Smith")); repository.save(new Customer("David",
 * "Williams")); repository.save(new Customer("Peter", "Davis")); return "add ";
 * }
 * 
 */
/*
 * @PostMapping(value="/loadd") public String process(@RequestBody Customer c){
 * 
 * repository.save(c); return "add "; }
 * 
 * 
 * @RequestMapping("/findall") public String findAll(){ String result =
 * "<html>";
 * 
 * for(Customer cust : repository.findAll()){ result += "<div>" +
 * cust.toString() + "</div>"; }
 * 
 * return result + "</html>"; }
 * 
 * /* @RequestMapping("/findbyid") public String findById(@RequestParam("id")
 * long id){ String result = ""; result = repository.findOne(id).toString();
 * return result; }
 */
/*
 * @RequestMapping("/findbylastname") /* public String
 * fetchDataByLastName(@RequestParam("lastname") String lastName){ String result
 * = "<html>";
 * 
 * for(Customer cust: repository.findByLastName(lastName)){ result += "<div>" +
 * cust.toString() + "</div>"; }
 * 
 * return result + "</html>"; }
 * 
 */
