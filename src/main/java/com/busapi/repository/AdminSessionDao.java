package com.busapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.busapi.models.CurrentAdminSession;


public interface AdminSessionDao extends JpaRepository<CurrentAdminSession, Integer> {

	public  CurrentAdminSession findByUuid(String uuid);

}
