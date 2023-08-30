package com.xworkz.school.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.school.dto.SchoolDto;

@Component
public class SchoolRepoImpl implements SchoolRepo{
	
	@Autowired
	EntityManagerFactory emf;

	@Override
	public boolean save(SchoolDto dto) {
	EntityManager em=	emf.createEntityManager();
	if(em!=null) {
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		return true;
	}
		
		return false;
	}

}
