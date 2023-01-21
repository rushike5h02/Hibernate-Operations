package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestInsertion {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		// insert data into database
			Student student = new Student();
				student.setStudentName("rushi");
				student.setLastName("bhand");
				student.setCity("nagar");
			
			session.save(student);
			t.commit();
			session.close();
			System.out.println("Record saved successfully.");

		
	}

}
