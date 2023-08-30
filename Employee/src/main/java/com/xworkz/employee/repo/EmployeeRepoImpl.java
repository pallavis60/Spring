package com.xworkz.employee.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import com.xworkz.employee.dto.EmployeeDto;

@Component
public class EmployeeRepoImpl implements EmployeeRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");

	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(EmployeeDto dto) {
		if (em != null) {
			EntityTransaction transaction = em.getTransaction();
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
	public EmployeeDto findById(int id) {
		if (em != null) {
			TypedQuery<EmployeeDto> query = em.createNamedQuery("findById", EmployeeDto.class);
			query.setParameter("id", id);
			EmployeeDto dto = query.getSingleResult();
			System.out.println("Data is found");
			return dto;
		}
		return null;
	}

	@Override
	public EmployeeDto findByIdAndName(int id, String name) {
		if (em != null) {
			TypedQuery<EmployeeDto> query = em.createNamedQuery("findByNameAndId", EmployeeDto.class);
			query.setParameter("nm", name);
			query.setParameter("id", id);
			EmployeeDto dto = query.getSingleResult();
			System.out.println("Data is found");
			return dto;

		}
		return null;
	}

	@Override
	public boolean updateExperianceByName(float exp, String name) {
		if (em != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Query query = em.createNamedQuery("updateExpByName");
			query.setParameter("exp", exp);
			query.setParameter("nm", name);
			query.executeUpdate();
			transaction.commit();
			System.out.println("experiance is updated succesfully");
			return true;

		}

		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		if (em != null) {

			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Query query = em.createNamedQuery("deleteByName");
			query.setParameter("nm", name);
			query.executeUpdate();
			transaction.commit();
			System.out.println("Data is deleted");
			return true;

		}
		return false;
	}

	@Override
	public List<EmployeeDto> readAll() {
		if (em != null) {
			Query query = em.createNamedQuery("readAll");
			List<EmployeeDto> dtos = query.getResultList();
			return dtos;
		}
		return null;
	}

	@Override
	public boolean updateExpAndPositionByNameAndId(float exp, String position, String name, int id) {

		if (em != null) {

			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			EmployeeDto dto = findByIdAndName(id, name);
			dto.setExperience(exp);
			dto.setPosition(position);
			transaction.commit();
			System.out.println("Data is updated");
			return true;

		}
		return false;
	}

	@Override
	public boolean deleteByNameAndId(int id, String name) {
		if (em != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			EmployeeDto dto = findByIdAndName(id, name);
			em.remove(dto);
			transaction.commit();
			System.out.println("Data is deleted successfully");
			return true;

		}
		return false;
	}

	@Override
	public List<EmployeeDto> findByName(String name) {
		if(em!=null) {
		TypedQuery<EmployeeDto> query=	em.createNamedQuery("findByName", EmployeeDto.class);
		  Query query1=query.setParameter("nm", name);
		List<EmployeeDto> list =  query1.getResultList();
		if(!list.isEmpty()) {
			System.out.println(list);
			return list;
		}
		return null;
		
		}
		return null;
	}

}
