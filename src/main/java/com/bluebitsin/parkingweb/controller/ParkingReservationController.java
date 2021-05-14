package com.bluebitsin.parkingweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingReservationController {

	@GetMapping("/index")
	public String index() {
		
		return "All is good";
	}
	
}
