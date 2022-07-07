/**
 * 
 */
package com.proximotech.epharmacy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author apple
 *
 */
@CrossOrigin(origins = "http://localhost:9090")
@RestController
@RequestMapping("/epharma")
public class AppController {
	
	@GetMapping
	public ResponseEntity<?> helloService() {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/test")
	public String test() {
		return "ok";
	}

}
