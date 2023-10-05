package com.xworkz.landrecord.repo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.landrecord.dto.AdminDto;

@Repository
public class LandRecordImpl implements LandRecordRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public AdminDto findByEmail(String email) throws Exception {
		EntityManager em = emf.createEntityManager();
		TypedQuery<AdminDto> query = em.createNamedQuery("findByEmail", AdminDto.class);
		query.setParameter("em", email);
		AdminDto dto = query.getSingleResult();
		return dto;

	}

	@Override
	public boolean updateOtpByEmail(String otp, String email) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateOtpByEmail");
		query.setParameter("otp", otp);
		query.setParameter("em", email);
		query.executeUpdate();
		try {
			em.getTransaction().commit();
			System.out.println("Data updated");
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			return false;
		} finally {
			em.close();
		}

	}

	@Override
	public AdminDto findOtp(String otp) throws Exception {
		EntityManager em = emf.createEntityManager();
		TypedQuery<AdminDto> query = em.createNamedQuery("findOtp", AdminDto.class);
		query.setParameter("otp", otp);
		AdminDto dto = query.getSingleResult();
		return dto;
	}

}
