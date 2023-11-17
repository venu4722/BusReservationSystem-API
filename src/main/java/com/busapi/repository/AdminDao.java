package com.busapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.busapi.models.Admin;


public interface AdminDao extends JpaRepository<Admin, Integer> {

	
	public Admin findByMobileNumber(String mobileNumber);
	
}
