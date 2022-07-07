/**
 * 
 */
package com.proximotech.epharmacy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proximotech.epharmacy.dto.User;

/**
 * @author apple
 *
 */
@RestController
@RequestMapping("/epharma")
public class UserController {
	
	@PostMapping("/user")
	public ResponseEntity<?> registerUser(@RequestBody User user){
		return null;
	}
	
	@PutMapping("/user")
	public ResponseEntity<?> updateUser(@RequestBody User user){
		return null;
	}

	
	@DeleteMapping("/user")
	public ResponseEntity<?> deleteUser(@RequestBody User user){
		return null;
	}
	
	@GetMapping("/user")
	public ResponseEntity<?> getUser(@RequestBody User user){
		return null;
	}

}
