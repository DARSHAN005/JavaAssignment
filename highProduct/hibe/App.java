package com.highProduct.hibe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    		System.out.println( "Project started" );
    		//connection established to the hibernate
    		Configuration cfg = new Configuration();
    		cfg.configure("hibernate.cfg.xml");
    		SessionFactory factory= cfg.buildSessionFactory();
    		// creating a Student object

    		Product pr=new Product();
    		pr.setId(102);
    		pr.setName("kurkure");
    		pr.setDescription("Tasty");

    		Session session= factory.openSession(); //Getting the data saved
    		Transaction tx= session.beginTransaction();

    		session.save(pr);
    		session.getTransaction().commit(); // Record saved to the database
    		session.close();	
    		System.out.println("Record saved succesfully itno the database!!!");
    	}
    }

