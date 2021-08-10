package com.jpa_adv_map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveEmployee {
	public static void main( String[ ] args ) {
		   
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "emp_per" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      
	      Employee employee = entitymanager.find( Employee.class, 1201 );
	      entitymanager.remove( employee );
	      entitymanager.getTransaction( ).commit( );
	      entitymanager.close( );
	      emfactory.close( );
	   }
}
