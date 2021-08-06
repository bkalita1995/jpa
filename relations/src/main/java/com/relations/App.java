package com.relations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Laptop laptop = new Laptop();
		laptop.setL_model("Hp");
		
		Student su = new Student();
		su.setF_name("Suresh");
		su.setL_name("Kumar");
		su.setLaptop(laptop);
		
	
		
		
		session.save(laptop);
		session.save(su);
		session.getTransaction().commit();
		session.clear();
		
				
		
		
	}

}
