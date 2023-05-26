package com.xworkz.cosmetics;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.cosmetics.dto.CosmeticsDTO;

public class CosmeticsRunner {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = factory.createEntityManager();
		//rollback
		entityManager.getTransaction().begin();
		
		entityManager.persist(new CosmeticsDTO(90, "", "kajal", 400,
				  "jan-2022", "jan-2025"));
		entityManager.getTransaction().commit();
		//insert-persist
		//update-merge
		//delete-remove or detach
		//select-find
		/*
		 * entityManager.persist(new CosmeticsDTO(5, "hgf brand", "kajal", 400,
		 * "jan-2022", "jan-2025")); entityManager.getTransaction().commit();
		 */
		/*
		 * CosmeticsDTO dtoFromDb = entityManager.find(CosmeticsDTO.class, 5);
		 * System.out.println(dtoFromDb);
		 * 
		 * entityManager.merge(new CosmeticsDTO(4, "ooo brand", "powder", 25,
		 * "jul-2022", "jan-2026")); //entityManager.getTransaction().commit();
		 * CosmeticsDTO a = entityManager.find(CosmeticsDTO.class, 4);
		 * System.out.println(a);
		 */
		
		
		//entityManager.merge(new CosmeticsDTO(7, "oop brand", "moisturizer", 200, "jun-2023", "jan-2026"));
		//entityManager.getTransaction().commit();
		
		//delete-remove method - fetch the data from table only then can u delete
		//CosmeticsDTO b = entityManager.find(CosmeticsDTO.class, 6);
		//entityManager.remove(b);
		
		//commit
		//entityManager.getTransaction().commit();
		//Hibernate query - HQL
		Query q = entityManager.createQuery("select entity from CosmeticsDTO entity where id=1") ;
	    CosmeticsDTO list =  (CosmeticsDTO) q.getSingleResult();
		System.out.println(list);
		
		
		Query q1 = entityManager.createQuery("select entity from CosmeticsDTO entity") ;
		List<CosmeticsDTO> list1 =  q1.getResultList();
		System.out.println(list1);
		
		
		                          
		Query q2 = entityManager.createQuery("select cosmeticBrand,price from CosmeticsDTO entity where id=1") ;
	  //	                 {"a brand",399.00}
		Object[] list2 =  (Object[]) q2.getSingleResult();
		for (Object object : list2) {
			
			System.out.println(object);
		}
		
		
		Query q3 = entityManager.createQuery("select cosmeticBrand,price from CosmeticsDTO entity") ;
	
		   
		List<Object[]> list3 = (List<Object[]>) q3.getResultList();
		for (Object[] objects : list3) {
			for (Object objects2 : objects) {
				
				System.out.println(objects2);
			}
		}
		
		
		Query q4 = entityManager.createQuery("select cosmeticBrand from CosmeticsDTO entity where id=1") ;
		String s = (String) q4.getSingleResult();
		System.out.println(s);
		
		
		
		Query q5 = entityManager.createQuery("select cosmeticBrand,type from CosmeticsDTO entity") ;
		List<Object[]> s2 = (List<Object[]>) q5.getResultList();
		for (Object[] objects : s2) {
			for (Object objects2 : objects) {
				
				System.out.println(objects2);
			}
		}		
	}

}
