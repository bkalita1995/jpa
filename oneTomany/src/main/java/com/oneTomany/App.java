package com.oneTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Laptop laptop = new Laptop();
		laptop.setL_model("Dell");
		laptop.setL_id(504);
	
		Students student = new Students();
		student.setRoll_no(100);
		student.setF_name("Arjun");
		student.setL_name("Das");
		student.getLaptop().add(laptop);
		
		session.save(student);
//		session.save(laptop);
		
		session.getTransaction().commit();
		session.clear();
		
	}
}
