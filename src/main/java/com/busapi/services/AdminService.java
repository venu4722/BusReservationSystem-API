package com.busapi.services;

import com.busapi.exceptions.AdminException;
import com.busapi.models.Admin;

public interface AdminService {
	
	public Admin createAdmin(Admin admin)throws AdminException;
	
	public Admin updateAdmin(Admin admin,String key)throws AdminException;
}
