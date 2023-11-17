package com.busapi.services;

import com.busapi.DTO.AdminLoginDTO;
import com.busapi.exceptions.LoginException;
import com.busapi.models.CurrentAdminSession;

public interface AdminLoginService {
	
	public CurrentAdminSession logIntoAdminAccount(AdminLoginDTO dto)throws LoginException;

	public String logOutFromAdminAccount(String key)throws LoginException;
}
