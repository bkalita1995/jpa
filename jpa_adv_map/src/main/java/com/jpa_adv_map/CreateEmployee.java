package com.jpa_adv_map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateEmployee {
	
	public static void main(String[] args) {
		
		
		  EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "emp_per" );	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
		
	      Employee employee = new Employee( ); 
	      employee.setEid( 1201 );
	      employee.setEname( "Gopal" );
	      employee.setSalary( 35000 );
	      employee.setDeg( "Asst Technical Manager" );
	      
	      Employee employee2  = new Employee();
	      employee2.setEid(1210);
	      employee2.setEname("Sekhar");
	      employee2.setSalary(60000);
	      employee2.setDeg("Senior Manager");
	      
	      entitymanager.persist( employee);
	      entitymanager.persist(employee2);
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
		
	}
	

}
