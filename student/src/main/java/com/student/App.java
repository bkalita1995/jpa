package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		//Student su = new Student();
		Student_2 su2 = new Student_2();
		
		su2.setFname("Biplob");
		su2.setLname("Kalita");
		su2.setStd("XII");
		
		
		//session.save(su);
		session.save(su2);
		session.getTransaction().commit();
		session.close();
		

	}

}
