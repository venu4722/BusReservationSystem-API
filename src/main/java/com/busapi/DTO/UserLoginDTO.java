package com.busapi.DTO;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserLoginDTO {
	
	@NotNull(message = "Mobile number should not be null")
	private String mobileNumber;
	
	@NotNull(message="password should not be null")
	private String password;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
