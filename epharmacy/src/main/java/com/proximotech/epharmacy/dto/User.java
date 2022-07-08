package com.proximotech.epharmacy.dto;

public class User {
	
	private String id;
	private String firstName;
	private String lastName;
	private String status;
	private String userId;
	private String createdTime;
	private String updatedTime;
	private String inactivatedTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getInactivatedTime() {
		return inactivatedTime;
	}

	public void setInactivatedTime(String inactivatedTime) {
		this.inactivatedTime = inactivatedTime;
	}

}
