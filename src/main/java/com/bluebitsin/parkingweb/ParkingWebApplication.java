package com.bluebitsin.parkingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ParkingWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ParkingWebApplication.class, args);	
	}

}
