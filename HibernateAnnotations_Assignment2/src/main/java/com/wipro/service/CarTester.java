package com.wipro.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.CarDetails;

public class CarTester {

	public static void main(String[] args) {
			Configuration cfg=new Configuration().configure("myconfig.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			Transaction transaction = session.beginTransaction();
			CarDetails c1=new CarDetails("KL-07","AB 123 Polo","White","Volkswagen");
			CarDetails c2=new CarDetails("KL-07","AB 234 Vento","Black","Volkswagen");
			CarDetails c3=new CarDetails("KL-07","AC 345 Corolla","Silver","Toyota");
			session.save(c1);
			session.save(c2);
			session.save(c3);
			transaction.commit();
			System.out.println("Records Inserted:"+c1+"\n"+c2+"\n"+c3);
			session.close();

	}

}
