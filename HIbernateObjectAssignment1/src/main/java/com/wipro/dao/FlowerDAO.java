package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.bean.Flower;
import com.wipro.util.FlowerUtil;

public class FlowerDAO {
	
	public static void main(String[] args) {
		
		Session session = FlowerUtil.getSessionFactory().openSession();
		Flower fobj=new Flower();
		fobj=session.get(Flower.class,"02");
		System.out.println("Record:"+fobj);
		session.close();
		
	}

}
