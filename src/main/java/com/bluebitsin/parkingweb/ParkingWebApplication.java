package com.bluebitsin.parkingweb;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingWebApplication.class, args);	
	}

	public static String generateRandomStringByUUID() {
        return UUID.randomUUID().toString();
    }
	
}
