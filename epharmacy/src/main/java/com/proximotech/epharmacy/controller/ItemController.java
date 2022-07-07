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
import com.proximotech.epharmacy.utils.AppEndPoints;

import io.swagger.annotations.ApiOperation;

/**
 * @author apple
 *
 */
@RestController
@RequestMapping("/epharma/")
public class ItemController {
	
	
	
	@PostMapping(AppEndPoints.ITEM)
	@ApiOperation("Item creation")
	public ResponseEntity<?> createItem(@RequestBody Item item){
		return null;
	}
	
	@PutMapping(AppEndPoints.ITEM)
	public ResponseEntity<?> updateItem(@RequestBody Item item){
		return null;
	}

	
	@DeleteMapping(AppEndPoints.ITEM)
	public ResponseEntity<?> deleteItem(@RequestBody Item item){
		return null;
	}

}
