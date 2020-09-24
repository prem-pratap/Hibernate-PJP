package com.wipro.DAO;
// hibernate object dao
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.bean.Flower;
import com.wipro.util.FlowerUtil;

public class FlowerDAO {
	
	public String deleteFlower(String fid){
		
		Session session = FlowerUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Flower fobj=new Flower();
		try {
			fobj=session.load(Flower.class,fid);
			fobj.setFlowerId(fid);
			session.delete(fobj);
			transaction.commit();
			session.close();
			return "SuccessFul";
					
			
			
		}catch(Exception e) {
			return "Flower with given FID is not present";
		}
		
		
	}

}
