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
	
	//display all cars
	public List <Object[]> getCars(){
		Session session =sf.openSession();
		Query query =session.createQuery("Select regNo,manufacturer From CarDetails");
		List<Object[]> list=query.getResultList();
		return list;
		
	}
	 //display car detail with regNo 
	public List <CarDetails> getCarDetail(String regNo){
		Session session =sf.openSession();
		Query<CarDetails> query =session.createQuery("From CarDetails cd where cd.regNo=?0");
		query.setParameter(0, regNo);
		return query.list();
		
	}
	
	
	

}
