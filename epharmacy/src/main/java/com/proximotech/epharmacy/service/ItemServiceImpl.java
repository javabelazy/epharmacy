package com.proximotech.epharmacy.service;

import org.springframework.stereotype.Service;

import com.proximotech.epharmacy.dto.Item;

/**
 * 
 */

/**
 * @author apple
 *
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Override
	public Item createItem(Item item) {
		return item;
	}

}
