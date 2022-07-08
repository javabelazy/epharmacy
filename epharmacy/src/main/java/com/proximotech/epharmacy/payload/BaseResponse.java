package com.proximotech.epharmacy.payload;
public class BaseResponse<T> {
	private boolean status;
	private T Data;
	private BaseError error;

	public BaseResponse(boolean status, T data, BaseError error) {
		super();
		this.status = status;
		Data = data;
		this.error = error;
	}

	public BaseResponse() {


	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public T getData() {
		return Data;
	}

	public void setData(T data) {
		Data = data;
	}

	public BaseError getError() {
		return error;
	}

	public void setError(BaseError error) {
		this.error = error;
	}

}