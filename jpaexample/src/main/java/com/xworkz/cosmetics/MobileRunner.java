package com.xworkz.cosmetics;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.cosmetics.dto.CosmeticsDTO;
import com.xworkz.cosmetics.dto.MobileDTO;

public class MobileRunner {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = factory.createEntityManager();

		// rollback
		entityManager.getTransaction().begin();

		/*
		 * entityManager.persist(new MobileDTO(1, "MI", "k325767cxl", "126gb", 12000));
		 * entityManager.persist(new MobileDTO(2, "apple", "d45fghj67l", "112gb",
		 * 14000)); entityManager.persist(new MobileDTO(3, "samsung", "k3465cgfgjl",
		 * "126gb", 16000)); entityManager.persist(new MobileDTO(4, "vivo",
		 * "g57f767bbl", "32gb", 10000)); entityManager.persist(new MobileDTO(5, "oppo",
		 * "hj67dfc67bl", "220gb", 19000));
		 *  entityManager.getTransaction().commit();
		 */
		

		
		 // MobileDTO a = entityManager.find(MobileDTO.class, 4); 
		  //System.out.println(a);
		
		
		
		 // entityManager.merge(new MobileDTO(5, "honor", "hj67dfc67bl", "220gb",19000)); 
		  //entityManager.getTransaction().commit();
		
		
		  
		 // MobileDTO b = entityManager.find(MobileDTO.class, 1);
		  //entityManager.remove(b);
		 
		//  entityManager.getTransaction().commit(); 
		  Query q = entityManager.createQuery("select entitys from MobileDTO entitys") ;
		  List<MobileDTO> list = q.getResultList(); 
		  System.out.println(list);
		  
		  Query q1 = entityManager.createQuery("select entity from MobileDTO entity where id=:i") ;
		    q1.setParameter("i", 2);
		  MobileDTO a =  (MobileDTO) q1.getSingleResult();
		  System.out.println(a);
			
			
		  Query q2 = entityManager.createQuery("select entity from MobileDTO entity") ;
		  List<MobileDTO> list1 =  q2.getResultList();
		  System.out.println(list1);
		 
		  
		  // Named Query
		  Query q3 = entityManager.createQuery("update MobileDTO entity set price =:pr  where id =:id") ;
		  q3.setParameter("pr", 50000);
		  q3.setParameter("id", 3);
		  int row = q3.executeUpdate();
		  entityManager.getTransaction().commit(); 
		  System.out.println(row);
		  
		  Query q4 = entityManager.createQuery("update MobileDTO entity set price =:pr, modelNo =:mod  where id =:id") ;
		  q4.setParameter("pr", 60000);
		  q4.setParameter("mod", "mdbj345nm4");
		  q4.setParameter("id", 1);
		  int r = q4.executeUpdate();
		  entityManager.getTransaction().commit(); 
		  System.out.println(r);
		  
		  Query q5 = entityManager.createQuery("update MobileDTO entity set storage =:str, modelNo =:mod  where mobileBrand =:mbrand") ;
		  q5.setParameter("str", "228gb");
		  q5.setParameter("mod", "po3n4kb3n3");
		  q5.setParameter("mbrand", "samsung");
		  int r1 = q5.executeUpdate();
		  entityManager.getTransaction().commit(); 
		  System.out.println(r1);

	}

}
