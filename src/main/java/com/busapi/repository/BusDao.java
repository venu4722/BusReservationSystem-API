package com.busapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.busapi.exceptions.BusException;
import com.busapi.models.Bus;

@Repository
public interface BusDao extends JpaRepository<Bus, Integer>{

	public List<Bus> findByBusType(String busType);
}
