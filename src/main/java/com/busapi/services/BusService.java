package com.busapi.services;

import java.util.List;

import com.busapi.exceptions.AdminException;
import com.busapi.exceptions.BusException;
import com.busapi.models.Bus;

public interface BusService {

	public Bus addBus(Bus bus,String key) throws BusException, AdminException;
	
	public Bus updateBus(Bus bus,String key) throws BusException, AdminException;
	
	public Bus deleteBus(Integer busId,String key) throws BusException, AdminException;
	
	public Bus viewBus(Integer busId) throws BusException;
	
	public List<Bus> viewBusByType(String BusType) throws BusException;
	
	public List<Bus> viewAllBuses() throws BusException;
	
}
