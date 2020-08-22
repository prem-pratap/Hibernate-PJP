package com.wipro.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.wipro.bean.Department;

public class DepartmentAdmin {

	public static void main(String[] args) {

			Configuration cfg=new Configuration().configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			Transaction transaction=session.beginTransaction();
			Department deptobj=new Department(50,"Marketing","London");
			session.save(deptobj);
			transaction.commit();
			System.out.println("Record Inserted");
			System.out.println(deptobj);
			session.close();
			
			
	}

}
