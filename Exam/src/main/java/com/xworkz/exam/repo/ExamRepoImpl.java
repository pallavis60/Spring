package com.xworkz.exam.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.exam.dto.ExamDto;

@Component
public class ExamRepoImpl implements ExamRepo {
	
	@Autowired
	EntityManagerFactory emf;
	

	@Override
	public boolean save(ExamDto dto) {
		
	EntityManager em =	emf.createEntityManager();
	if(em!=null) {
	EntityTransaction trans =	em.getTransaction();
	trans.begin();
	em.persist(dto);
	trans.commit();
	System.out.println("Data is saved");
	return true;
		
	}	
		return false;
	}



	@Override
	public List<ExamDto> findByName(String name) {
		EntityManager em =	emf.createEntityManager();
		if(em!=null) {
			System.out.println("Find BY name method");
		TypedQuery<ExamDto> query =	em.createNamedQuery("findByName", ExamDto.class);
		 query.setParameter("nm", name);
		 if(query!=null) {
		List<ExamDto> list = query.getResultList();
		 
		if(!list.isEmpty()) {
			 
			 return  list;
			
		}
		 }
		 System.out.println("Dto is null");
		return null;
		 
	}
		return null;
}
}		

		 


	


