package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.bean.Flower;
import com.wipro.util.FlowerUtil;

public class FlowerDao {
	
	public String updateFlower(String fid,int price){
		
		Session session = FlowerUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Flower fobj=new Flower();
		try {
			fobj=session.load(Flower.class,fid);
			fobj.setFlowerId(fid);
			fobj.setPrice(price);
			transaction.commit();
			session.close();
			return "SuccessFul";
					
			
			
		}catch(Exception e) {
			return "Flower with given FID is not present";
		}
		
		
	}
	
	public void showFlower(String fid) {
		Session session = FlowerUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Flower fobj=new Flower();
		fobj=session.load(Flower.class, fid);
		System.out.println("Updated record:"+fobj);
		
	}

}
