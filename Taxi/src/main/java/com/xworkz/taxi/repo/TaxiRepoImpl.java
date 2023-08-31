package com.xworkz.taxi.repo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi.dto.TaxiDto;


public class TaxiRepoImpl implements TaxiRepo {
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TaxiProperties");

	EntityManager em = emf.createEntityManager();

	@Override
	public boolean saveTaxi(TaxiDto dto) {
	EntityManager em=	emf.createEntityManager();
	
	if(em!=null) {
		
		 EntityTransaction  transaction=em.getTransaction();
		 transaction.begin();
		 em.persist(dto);
		 transaction.commit();
		 System.out.println("Data is saved successfully");
		 return true;
		 
	}
	System.out.println("Data is not saved");
		return false;
	}

	@Override
	public List<TaxiDto> readAll() {
		EntityManager em=	emf.createEntityManager();
		if(em!=null) {
			
			TypedQuery<TaxiDto> query =em.createNamedQuery("readAll", TaxiDto.class);
			List<TaxiDto> dtos=query.getResultList();
			return dtos;
			
		}
		return null;
	}

	@Override
	public TaxiDto findTaxiByLocation(String location) {
		EntityManager em=	emf.createEntityManager();
		if(em!=null) {
			TypedQuery<TaxiDto> query=em.createNamedQuery("findTaxiByLocation", TaxiDto.class);
		  	 TypedQuery<TaxiDto> query1=query.setParameter("lc", location);
		  	 return query1.getSingleResult();
		}
		
		return null;
	}

	@Override
	public boolean updateTaxiAvailableById(int id, boolean status) {
		EntityManager em=	emf.createEntityManager();
		if(em!=null) {
			EntityTransaction transaction=em.getTransaction();
			transaction.begin();
			Query query=em.createNamedQuery("updateTaxiAvailableById");
			query.setParameter("id", id);
			query.setParameter("status", status);
			query.executeUpdate();
			transaction.commit();
			System.out.println("Status is updated ");
			return true;
			
		}
		System.out.println("Status is not upated");
		return false;
	}

	@Override
	public List<TaxiDto> findByAvailableStatus(boolean available) {
		EntityManager em=	emf.createEntityManager();
		if(em!=null) {
			
		TypedQuery<TaxiDto> query =	em.createNamedQuery("findByAvailableStatus", TaxiDto.class);
		TypedQuery<TaxiDto> query1  =    query.setParameter("avla", available);
		  List<TaxiDto> dtos   =  query.getResultList();
		   return dtos;	
		  
			  
		  }
		
		
		return null;
	}

	@Override
	public boolean updateTaxiEarningsById(int earning, int id) {
		EntityManager em=	emf.createEntityManager();
		if(em!=null) {
			EntityTransaction transaction=em.getTransaction();
			transaction.begin();
		Query query=em.createNamedQuery("updateTaxiEarningsById");
		query.setParameter("id", id);
		query.setParameter("ear", earning);
		query.executeUpdate();
		transaction.commit();
		System.out.println("Data is updated");
		return true;
		
		}
		System.out.println("Data is not updated");
		
		return false;
	}

	@Override
	public TaxiDto bookTaxi() {
		EntityManager em=	emf.createEntityManager();
		if(em!=null) {
			
			List<TaxiDto>  dtos =	findByAvailableStatus(true);
			
			MyComparator comp = new MyComparator();
			
			Collections.sort(dtos, comp);
			
			for(TaxiDto list:dtos) {
				System.out.println(list);
			}
			
		
		for(TaxiDto li:dtos) {
			int eachTripEarning = 200;
			int updatedEarnings = li.getEarnings() + eachTripEarning;
			
			updateTaxiEarningsById(updatedEarnings, li.getId());
			updateTaxiAvailableById(li.getId(),false);
			return li;
			
		}
		return  null;
				
			}
		return null;
			}			
			
	}


