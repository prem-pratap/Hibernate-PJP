package com.wipro.dao;




import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.CarDetails;
import com.wipro.bean.OwnerDetail;

public class OwnerDao {
	
	SessionFactory sf;
	
	public OwnerDao() {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
	}
	
	public String addOwner(OwnerDetail owner) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.persist(owner.getCar());
		transaction.commit();
		
		return "Success";
		
	}

}
