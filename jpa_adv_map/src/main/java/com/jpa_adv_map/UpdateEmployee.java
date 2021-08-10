package com.jpa_adv_map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateEmployee {
		public static void main(String[] args) {
			
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "emp_per" );	      
		    EntityManager entitymanager = emfactory.createEntityManager( );
		    entitymanager.getTransaction( ).begin( );
		    
		   
		    Employee employee = entitymanager.find( Employee.class, 1205 );
		      
		      //before update
		      System.out.println( employee );
		      employee.setSalary( 40000);
		      entitymanager.getTransaction( ).commit( );
		      
		      //after update
		      System.out.println( employee );
		      entitymanager.close();
		      emfactory.close();
		    
		}
}
