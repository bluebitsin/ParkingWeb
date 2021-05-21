package com.bluebitsin.parkingweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.ParkingTicket;
import com.bluebitsin.parkingweb.model.QRData;
import com.bluebitsin.parkingweb.model.VerifyQRData;
import com.bluebitsin.parkingweb.services.ParkingReservationService;

@RestController
public class ParkingReservationController {

	@Autowired
	private ParkingReservationService parkingReservationService;
	
	@GetMapping("/index")
	public String index() {
		
		return "All is good";
	}
	
	/*
	 * Get all reservation for a specific customer
	 * @Method = GET
	 * @param customerId
	 */
	@GetMapping("/parking/all/{customerId}")
	public String getAllReservations(@PathVariable int customerId) {
		
		return "Mukesh";
	}
	
	/*
	 * Get only one reservation record
	 * @Method = GET
	 * @param reservationId
	 */
	@GetMapping("/parking/one/{reservationId}")
	public String getReservation(@PathVariable int reservationId) {
		
		return "Narayan";
	}
	
	/*
	 * Book or Add new  parking slot
	 * @Method = POST
	 * @param customerId
	 */
	@PostMapping(path = "/parking/add", consumes = "application/json",
			produces = "application/json")
	public ParkingTicket addReservation(@RequestBody Customer customer) {
		
		return parkingReservationService.addParkingReservation(customer);
	}
	
	/*
	 * Verify  existing reservation
	 * @Method = GET
	 * @param  reservationId
	 */
	@GetMapping(path = "/parking/verify/{reservationId}", produces = "application/json")
	public VerifyQRData verifyReservation(@PathVariable String reservationId) {
		
		return parkingReservationService.verifyParkingTicket(reservationId);
		
	}
	
	/*
	 * Modify or Update  existing reservation
	 * @Method = PUT
	 * @param updateReservation
	 */
	@PostMapping(path = "/parking/{customerId}",
			consumes = "application/json", produces = "application/json")
	public ParkingTicket updateReservation(@RequestBody ParkingTicket updateReservation) {
		
		return null;
	}
	
	
	/*
	 * Delete  existing reservation
	 * @Method = DELETE
	 * @param reservationId
	 */
	@DeleteMapping("/parking/{reservationId}")
	public ResponseEntity<HttpStatus> deleteReservation(@PathVariable int reservationId){
		
		try {
			
			return new ResponseEntity<>(HttpStatus.OK);
			
		}catch(Exception e) {
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
}
