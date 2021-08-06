package com.employee;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Emp_details emp_det = new Emp_details();
		emp_det.setF_name("Dhruba");
		emp_det.setL_name("Deka");
		emp_det.setM_name("Joyti");
	//	emp_det.setAddress("Assam, Gohpur,784168");
		
		
		Emp_Id emp_id = new Emp_Id();
		
		emp_id.setEmp_name(emp_det);
		emp_id.setDept_name("Software Devloper");
		
		session.save(emp_id);
		session.getTransaction().commit();
		session.close();
		
		
		
		

	}

}
