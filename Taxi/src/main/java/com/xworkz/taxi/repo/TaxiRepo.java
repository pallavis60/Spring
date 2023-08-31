package com.xworkz.taxi.repo;

import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;

public interface TaxiRepo {
	
	public boolean saveTaxi(TaxiDto dto);
	
	public List<TaxiDto> readAll();
	
	public TaxiDto findTaxiByLocation(String location);

	public boolean updateTaxiAvailableById(int id, boolean status);
  
	
	public List<TaxiDto> findByAvailableStatus(boolean available);
	
	public boolean updateTaxiEarningsById(int earning,int id);
	
	public TaxiDto bookTaxi();
}
