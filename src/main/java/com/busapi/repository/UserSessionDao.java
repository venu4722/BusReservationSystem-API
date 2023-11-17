package com.busapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.busapi.models.CurrentUserSession;


public interface UserSessionDao extends JpaRepository<CurrentUserSession, Integer> {
	
	
	public CurrentUserSession findByUuid(String uuid);
	
}
