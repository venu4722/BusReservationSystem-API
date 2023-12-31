package com.busapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.busapi.models.User;

public interface UserDao extends JpaRepository<User, Integer> {

	public User findByMobileNumber(String mobileNumber);
	
}
