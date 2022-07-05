/**
 * 
 */
package com.proximotech.epharmacy.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author apple
 *
 */
public class Item {
	
	private long id;
	private String name;
	private String code;
	private String manufactor;
	private String category;
	private String startDate;
	private String expiryDate;
	private Long quantity;
	private int quantityUnit;
	private BigDecimal actualPrice;
	private BigDecimal dealPrice;
	private String status;
	private Long remainingItems;
	private Long soldCount;
	private Long ownerId;
	private String imageUrl;
	private List<String> imageList;
	private String createdTime;
	private String updatedTime;

}
