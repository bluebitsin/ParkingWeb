package com.bluebitsin.parkingweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bluebitsin.parkingweb.model.Customer;
import com.bluebitsin.parkingweb.model.ParkingTicket;
import com.bluebitsin.parkingweb.model.RequestCheckStatus;
import com.bluebitsin.parkingweb.model.VerifyQRData;
import com.bluebitsin.parkingweb.services.ParkingReservationService;

@RestController
public class ParkingReservationController {

	@Autowired
	private ParkingReservationService parkingReservationService;

	@GetMapping("/reservation/index")
	public String index() {

		return "All is good";
	}

	/*
	 * Get all reservation for a specific customer
	 * 
	 * @Method = GET
	 * 
	 * @param customerId
	 */
	@GetMapping("/parking/all/{customerId}")
	public ResponseEntity<List<ParkingTicket>> getAllReservations(@PathVariable int customerId) {

		List<ParkingTicket> allReservations = parkingReservationService.getAllParkingReservation(customerId);
		
		if(allReservations == null) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		if(allReservations.size()<=0) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(allReservations));
	}

	/*
	 * Get only one reservation record
	 * 
	 * @Method = GET
	 * 
	 * @param reservationId
	 */
	@GetMapping("/parking/one/{reservationId}")
	public String getReservation(@PathVariable int reservationId) {

		return "Narayan";
	}
	
	/*
	 * Signal the servo gate to close
	 * 
	 * @Method = GET
	 * 
	 * @param sate_status
	 */
	@GetMapping("/parking/gate/{gateStatus}")
	public ResponseEntity<HttpStatus> closeServoGate(@PathVariable int gateStatus) {

		try {

			boolean isGateClose = parkingReservationService.closeGate(gateStatus);
			if(isGateClose) {
				return new ResponseEntity<>(HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED); //417
			}
			

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
		
	}

	/*
	 * Book or Add new parking slot
	 * 
	 * @Method = POST
	 * 
	 * @param customerId
	 */
	@PostMapping(path = "/parking/add", consumes = "application/json", produces = "application/json")
	public ParkingTicket addReservation(@RequestBody Customer customer) {

		return parkingReservationService.addParkingReservation(customer);
	}

	/*
	 * Verify existing reservation
	 * 
	 * @Method = GET
	 * 
	 * @param reservationId
	 */
	@GetMapping(path = "/parking/verify/{reservationId}", produces = "application/json")
	public VerifyQRData verifyReservation(@PathVariable String reservationId) {

		return parkingReservationService.verifyParkingTicket(reservationId);

	}

	/*
	 * Modify or Update existing reservation
	 * 
	 * @Method = PUT
	 * 
	 * @param checkStatus
	 */
	@PostMapping(path = "/parking/update", consumes = "application/json", produces = "application/json")
	public ResponseEntity<HttpStatus> updateReservation(@RequestBody RequestCheckStatus checkStatus) {

		try {

			return parkingReservationService.updateCheckStatus(checkStatus);
			//return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	/*
	 * Delete existing reservation
	 * 
	 * @Method = DELETE
	 * 
	 * @param reservationId
	 */
	@DeleteMapping("/parking/{reservationId}")
	public ResponseEntity<HttpStatus> deleteReservation(@PathVariable int reservationId) {

		try {

			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
}
