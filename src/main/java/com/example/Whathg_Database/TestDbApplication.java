package com.example.Whathg_Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;





@EnableAutoConfiguration

@SpringBootApplication
@ComponentScan("com.example")
public class TestDbApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TestDbApplication.class, args);
	}
	
	
	
	

	
	


}
