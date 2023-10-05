package com.xworkz.book.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.book.dto.BookDto;

@Repository
public class BookRepoImpl implements BookRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean save(BookDto dto) {

		EntityManager em = emf.createEntityManager();
		if (em != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dto);
			try {
				transaction.commit();
				System.out.println("Data is saved");
				return true;
			} catch (Exception e) {
				transaction.rollback();
				e.printStackTrace();
				return false;

			} finally {
				em.close();
			}

		}

		return false;
	}

	@Override
	public BookDto findBYName(String name) {
		EntityManager em = emf.createEntityManager();
		if (em != null) {
			TypedQuery<BookDto> query = em.createNamedQuery("findByName", BookDto.class);
			query.setParameter("bn", name);
			List<BookDto> dtos = query.getResultList();
			if (!dtos.isEmpty()) {
				BookDto dto = query.getSingleResult();
				return dto;
			}
			return null;

		}
		return null;
	}

	@Override
	public List<BookDto> readAll() {

		EntityManager em = emf.createEntityManager();
		if (em != null) {
			Query query = em.createNamedQuery("readAll");
			List<BookDto> dto = query.getResultList();
			return dto;

		}

		return null;
	}
}
