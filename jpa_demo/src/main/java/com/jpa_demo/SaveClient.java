package com.jpa_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveClient {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "emp_per" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      //Teaching staff entity 
	      TeachingStaff ts1 = new TeachingStaff(1,"Gopal","MSc MEd","Maths");
	      TeachingStaff ts2 = new TeachingStaff(2, "Manisha", "BSc BEd", "English");

	      //Non-Teaching Staff entity
	      NonTeachingStaff nts1 = new NonTeachingStaff(3, "Satish", "Accounts");
	      NonTeachingStaff nts2 = new NonTeachingStaff(4, "Krishna", "Office Admin");

	      //storing all entities
	      entitymanager.merge(ts1);
	      entitymanager.merge(ts2);
	      entitymanager.merge(nts1);
	      entitymanager.merge(nts2);

	      entitymanager.getTransaction().commit();
	      entitymanager.close();
	      emfactory.close();

	}

}
