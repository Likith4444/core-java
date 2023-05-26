package com.xworkz.cosmetics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.cosmetics.dto.CarsDTO;

public class CarsRunner {
	
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		/*
		 * entityManager.persist(new CarsDTO(1, "maruti", "black", "suv", 1300900));
		 * entityManager.persist(new CarsDTO(2, "Tata", "blue", "sedan", 999990));
		 * entityManager.persist(new CarsDTO(3, "Mahindra", "white", "suv", 1200000));
		 * entityManager.getTransaction().commit();
		 * 
		 * entityManager.merge(new CarsDTO(3, "Mahindra", "white", "suv", 1200000));
		 * entityManager.getTransaction().commit();
		 */
		
		CarsDTO f = entityManager.find(CarsDTO.class, 2); 
		System.out.println(f);
		
		CarsDTO d = entityManager.find(CarsDTO.class, 1);
		entityManager.remove(d);
		
	}

}
