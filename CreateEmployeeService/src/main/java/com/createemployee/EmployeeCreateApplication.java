package com.createemployee;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;




@SpringBootApplication
@EnableEurekaClient
public class EmployeeCreateApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCreateApplication.class, args);
	}

}
