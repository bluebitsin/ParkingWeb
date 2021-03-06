package com.bluebitsin.parkingweb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bluebitsin.parkingweb.model.User;
import com.bluebitsin.parkingweb.services.UserService;

@RestController
public class Authentication {

	@Autowired
	private UserService userService;

	@GetMapping("/user/index")
	public String index() {

		return "Test Sucess";
	}

	/**
	 * Password base authentication
	 * 
	 * @param mobile
	 * @param password
	 * @return User Object
	 */
	@PostMapping(path = "/user/login",
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> loginUser(@RequestBody MultiValueMap<String, String> values) {

		String mobile = values.getFirst("mobile");
		String password = values.getFirst("password");

		//System.out.println("Mobile: " + mobile + " Password: " + password);

		User user = userService.getLoginUser(mobile, password);

		try {

			if (user != null) {

				return ResponseEntity.of(Optional.of(user));

			} else {

				// 404 - user not found
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

			}

		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	
	/**
	 * Password base authentication
	 * 
	 * @param mobile
	 * @param password
	 * @return User Object
	 */
	@PostMapping(path = "/agent/login",
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> loginAgent(@RequestBody MultiValueMap<String, String> values) {
		
		String mobile = values.getFirst("mobile");
		String password = values.getFirst("password");

		//System.out.println("Mobile: " + mobile + " Password: " + password);

		User user = userService.getLoginAgent(mobile, password);

		try {

			if (user != null) {

				return ResponseEntity.of(Optional.of(user));

			} else {

				// 404 - user not found
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

			}

		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
}
