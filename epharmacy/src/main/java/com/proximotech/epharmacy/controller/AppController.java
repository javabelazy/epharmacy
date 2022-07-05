/**
 * 
 */
package com.proximotech.epharmacy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author apple
 *
 */
@RestController
@RequestMapping("/epharma")
public class AppController {
	
	@GetMapping
	public String helloService() {
		return "ok";
	}

}