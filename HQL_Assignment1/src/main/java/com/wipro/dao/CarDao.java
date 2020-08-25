package com.wipro.dao;

import java.util.List;


import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.CarDetails;

public class CarDao {
	
	SessionFactory sf;
	
	public CarDao() {
		Configuration cfg=new Configuration().configure("myconfig.cfg.xml");
		sf=cfg.buildSessionFactory();
	}
	
	public List <CarDetails> getCars(){
		Session session =sf.openSession();
		Query<CarDetails> query =session.createQuery("From CarDetails");
		return query.list();
		
	}

}
