package com.xworkz.taxi.service;

import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;

public interface TaxiService {
	
	public boolean saveTaxi(TaxiDto dto);
	
	public List<TaxiDto> readAll();
	
	public TaxiDto findTaxiByLocation(String location);
	
	public boolean updateTaxiAvailableById(int id,boolean status);
	
	public List<TaxiDto> findByAvailableStatus(boolean available);
	
	public boolean updateTaxiEarningsById(int earning, int id);
	
	public List<TaxiDto> bookTaxi();
}
