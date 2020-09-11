package com.wipro.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.CarDetails;
import com.wipro.dao.CarDao;

public class CarHQLTester {

	public static void main(String[] args) {
			
			CarDao dao=new CarDao();
			//display all cars
			List <CarDetails> result=dao.getCars();
			System.out.println("Cars Records:");
			for (CarDetails cobj:result)
				System.out.println(cobj);
			

	}

}
