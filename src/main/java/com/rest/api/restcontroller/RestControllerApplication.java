package com.rest.api.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={
		"com.rest.api.course", "com.rest.api.restcontroller"})
//@ComponentScan(basePackages = {"com"})
public class RestControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestControllerApplication.class, args);
		System.out.println("\n############### UP & RUNNING ###############");
	}

}
