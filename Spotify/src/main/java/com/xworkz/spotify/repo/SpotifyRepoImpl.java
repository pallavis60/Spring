package com.xworkz.spotify.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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


	@Override
	public List<SongDto> readAll() {
		EntityManager em =	emf.createEntityManager();
		if(em!=null) {
		Query query =	em.createNamedQuery("read");
		   List<SongDto> list =query.getResultList();
		   System.out.println(list);
		   return list;
		}
		
		
		return null;
	}


	@Override
	public SongDto findByName(String name) {
		EntityManager em =	emf.createEntityManager();
		if(em!=null) {
			TypedQuery<SongDto>	query  =em.createNamedQuery("findByName", SongDto.class);
			query.setParameter("nm", name);
			List<SongDto> dtos =	query.getResultList();
			
			if(!dtos.isEmpty()) {
			SongDto dto=query.getSingleResult();
			return dto;
				
			}
			System.out.println("No Entity is found");
			return null;
					
				}

		return null;
	}


	@Override
	public boolean updateArtistNameBySong(String artistName, String songTitle) {
		EntityManager em =	emf.createEntityManager();
		em.getTransaction().begin();
	Query query =	em.createNamedQuery("update")
		.setParameter("an", artistName)
		.setParameter("st", songTitle);
       int i =	query.executeUpdate();
       
       
       
       try {
		em.getTransaction().commit();
		if(i>0) {
			System.out.println("Data is updated");
			return true;
		}
	} catch (Exception e) {
		em.getTransaction().rollback();
		e.printStackTrace();
		return false;
	}
       finally {
    	   em.close();
       }
       
		return false;
	}


	@Override
	public boolean deleteBySongName(String songTitle) {
		EntityManager em =	emf.createEntityManager();
		em.getTransaction().begin();
	    Query query =	em.createNamedQuery("delete")
	     .setParameter("sn", songTitle);
	      int i = query.executeUpdate();
	      
	      try {
			em.getTransaction().commit();
			if(i>0) {
				System.out.println("Data is deleted");
				return true;
			}
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			return false;
			
		}
	      finally {
	    	  System.out.println("REsource is closed");
	    	  
	    	  em.close();
	      }
	      return false;
	      
	    
	}

}
