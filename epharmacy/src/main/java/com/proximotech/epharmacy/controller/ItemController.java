/**
 * 
 */
package com.proximotech.epharmacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proximotech.epharmacy.dto.Item;
import com.proximotech.epharmacy.dto.User;
import com.proximotech.epharmacy.payload.BaseResponse;
import com.proximotech.epharmacy.service.ItemService;
import com.proximotech.epharmacy.constants.AppEndPoints;

import io.swagger.annotations.ApiOperation;

/**
 * @author apple
 *
 */
@RestController
@RequestMapping("/epharma/")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping(AppEndPoints.ITEM)
	@ApiOperation("Item creation")
	public ResponseEntity<?> createItem(@RequestBody Item item){
		Item i = itemService.createItem(item);
		BaseResponse<Item> response = new  BaseResponse<>();
		response.setData(i);
		return ResponseEntity.ok(response);
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
