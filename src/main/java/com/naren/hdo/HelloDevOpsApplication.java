package com.naren.hdo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDevOpsApplication.class, args);
	}
	
	@RestController
	public class HelloController{
		
		@RequestMapping(path="/{name}", method = RequestMethod.GET)
		public String sayHello(@PathVariable String name){
			return "Hello "+name;
		}
	}
	
	
}
