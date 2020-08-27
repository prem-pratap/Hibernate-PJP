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
			CarDetails c1=new CarDetails("RJ20","VXI","Swift","Maruti");
			session.save(c1);
			transaction.commit();
			System.out.println("Record Inserted:"+c1);
			session.close();

	}

}
