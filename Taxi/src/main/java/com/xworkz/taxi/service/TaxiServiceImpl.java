package com.xworkz.taxi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.repo.TaxiRepo;

@Component
public class TaxiServiceImpl implements TaxiService {
	
@Autowired	
private TaxiRepo repo;
	
	@Override
	public boolean saveTaxi(TaxiDto dto) {
		if(dto!=null) {
			if(dto.getId()>0) {
				if(dto.getEarnings()>100 && dto.getEarnings()<2000) {
					if(dto.getLocation()!=null && dto.getLocation().length()>=5) {
						if(dto.getTaxiNo()>0) {
								if(dto.getTrips()!=null) {
									System.out.println("Data is validated");
									return repo.saveTaxi(dto);
								}
								
								System.out.println("trips is not valid");
								return false;
						}
						System.out.println("Taxi number is not valid");
						return false;
					}
					System.out.println("Location is not valid");
					return false;
					
				}
				System.out.println("Earning is not valid");
				return false;
			}
			System.out.println("Id should more than 0");
			return false;
		}
		System.out.println("Dto is null");
		return false;
	}

	@Override
	public List<TaxiDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public TaxiDto findTaxiByLocation(String location) {
		if(location!=null && location.length()>=5){
			System.out.println("Given location is valid");
			return repo.findTaxiByLocation(location);
		
	}
		System.out.println("Given location is not valid");
		return null;
	}

	@Override
	public boolean updateTaxiAvailableById(int id, boolean status) {
		if(id>0) {
			System.out.println("Id is valid");
			return repo.updateTaxiAvailableById(id,status);
		}
		System.out.println("id is not valid");
		return false;
	}

	@Override
	public List<TaxiDto> findByAvailableStatus(boolean available) {
		return repo.findByAvailableStatus(available);
	}

	@Override
	public boolean updateTaxiEarningsById(int earning,int id) {
		if(id>0) {
			if(earning>0 && earning<2000) {
				System.out.println("Data is valid");
				return repo.updateTaxiEarningsById(earning, id);
			}
			System.out.println("earning is not valid");
			return false;
			
		}
		System.out.println("Id is not valid");
		return false;
	}

	@Override
	public List<TaxiDto> bookTaxi() {
		return repo.bookTaxi();
		
	}
	
}
