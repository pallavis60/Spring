package com.xworkz.spotify.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.spotify.dto.SongDto;

@Repository
public class SpotifyRepoImpl implements SpotifyRepo {
	
	@Autowired
	private EntityManagerFactory emf;
	

	@Override
	public boolean save(SongDto dto) {
	EntityManager em =	emf.createEntityManager();
	  if(em!=null) {
		 EntityTransaction transaction = em.getTransaction();
		 transaction.begin();
		 em.persist(dto);
		 transaction.commit();
		 System.out.println("Data is saved");
		 return true;
		 
	  }
		
		
		return false;
	}

}
