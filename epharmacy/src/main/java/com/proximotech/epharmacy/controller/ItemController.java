/**
 * 
 */
package com.proximotech.epharmacy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proximotech.epharmacy.dto.Item;

/**
 * @author apple
 *
 */
@RestController
@RequestMapping("/epharma")
public class ItemController {
	
	@PostMapping("/item")
	public ResponseEntity<?> createItem(@RequestBody Item item){
		return null;
	}
	
	@PutMapping("/item")
	public ResponseEntity<?> updateItem(@RequestBody Item item){
		return null;
	}

	
	@DeleteMapping("/item")
	public ResponseEntity<?> deleteItem(@RequestBody Item item){
		return null;
	}

}
