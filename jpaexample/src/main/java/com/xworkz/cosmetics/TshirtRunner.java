package com.xworkz.cosmetics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.cosmetics.dto.TshirtDto;

public class TshirtRunner {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		//entityManager.persist(new TshirtDto(1, "levis", "black", "M", 900));
		//entityManager.persist(new TshirtDto(2, "US polo", "orange", "L", 990));
		//entityManager.persist(new TshirtDto(3, "LV", "red", "S", 1200));
		
		
		entityManager.merge(new TshirtDto(1, "levis", "black", "M", 900));

		
		TshirtDto find = entityManager.find(TshirtDto.class, 2); 
		System.out.println(find);
		
		//TshirtDto del = entityManager.find(TshirtDto.class, 1);
		//entityManager.remove(del);
		//entityManager.getTransaction().commit();
		
		
		Query q = entityManager.createQuery("update TshirtDto entity set size = ? where id = ?") ;
		q.setParameter(0, "XXL");
	    q.setParameter(1, 1);
        int r = q.executeUpdate();
	    entityManager.getTransaction().commit(); 
	    System.out.println(r);
		
	}

}
