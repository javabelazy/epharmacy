/**
 * 
 */
package com.proximotech.epharmacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proximotech.epharmacy.dto.User;
import com.proximotech.epharmacy.payload.BaseResponse;
import com.proximotech.epharmacy.service.UserServiceImpl;

/**
 * @author apple
 *
 */
@RestController
@RequestMapping("/epharma")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/user")
	public ResponseEntity<?> registerUser(@RequestBody User user){
		User result = userService.registerUser(user);
		BaseResponse<User> response = new  BaseResponse<>();
		response.setData(result);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/user")	public ResponseEntity<?> updateUser(@RequestBody User user){
		User result = userService.updateUser(user);
		BaseResponse<User> response = new  BaseResponse<>();
		response.setData(result);
		return ResponseEntity.ok(response);
	}

	
	@DeleteMapping("/user")
	public ResponseEntity<?> deleteUser(@RequestBody User user){
		User result = userService.deactivateUser(user);
		BaseResponse<User> response = new  BaseResponse<>();
		response.setData(result);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/user")
	public ResponseEntity<?> getUser(@RequestBody User user){
		User result = userService.getUserInfo(user);
		BaseResponse<User> response = new  BaseResponse<>();
		response.setData(result);
		return ResponseEntity.ok(response);
	}

}
