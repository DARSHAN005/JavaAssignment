package com.hibernate.Course_details;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      System.out.println("project started");
      Configuration cfg =new Configuration();
      cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		// creating a Student object
		Course cr= new Course();
		cr.setCourseId(1);
		cr.setCourseName("Java");
		cr.setCoursePrices(20000);
		cr.setCourseDuration("30 hrs");
		Session session= factory.openSession(); //Getting the data saved
		Transaction tx= session.beginTransaction();

		session.save(cr);
		session.getTransaction().commit(); // Record saved to the database
		session.close();	
		System.out.println("Record saved succesfully itno the database!!!");
    }
}
