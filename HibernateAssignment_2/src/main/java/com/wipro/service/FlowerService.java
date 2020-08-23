package com.wipro.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.bean.Flower;
import com.wipro.util.FlowerUtil;


public class FlowerService {

	public static void main(String[] args) {
		
		Session session = FlowerUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Flower f1=new Flower("02", "Carnation", "White", 15);
		session.save(f1);
		transaction.commit();
		session.close();
		System.out.println(f1);
		

	}

}
