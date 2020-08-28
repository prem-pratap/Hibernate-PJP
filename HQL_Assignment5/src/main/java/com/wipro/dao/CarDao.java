package com.wipro.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.hibernate.Criteria;
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
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<CarDetails> cr=cb.createQuery(CarDetails.class);
		Root <CarDetails> root=cr.from(CarDetails.class);
		cr.select(root);
		Query <CarDetails> query=session.createQuery(cr);
		return query.list();
	}

}
