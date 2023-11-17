package com.busapi.services;

import com.busapi.DTO.UserLoginDTO;
import com.busapi.exceptions.LoginException;
import com.busapi.models.CurrentUserSession;

public interface UserLoginService {
	
	public CurrentUserSession logIntoUserAccount(UserLoginDTO dto)throws LoginException;

	public String logOutFromUserAccount(String key)throws LoginException;
}
