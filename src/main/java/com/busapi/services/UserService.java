package com.busapi.services;

import java.util.List;

import com.busapi.exceptions.AdminException;
import com.busapi.exceptions.UserException;
import com.busapi.models.User;

public interface UserService {

	
	public User createUser(User user)throws UserException;
	
	public User updateUser(User user,String key)throws UserException;
	
	public User deleteUser(Integer userId,String key) throws UserException, AdminException;
	
	public User viewUserById(Integer userId, String key) throws UserException, AdminException;
	
	public List<User> viewUsers(String key) throws UserException, AdminException; 
	
}
