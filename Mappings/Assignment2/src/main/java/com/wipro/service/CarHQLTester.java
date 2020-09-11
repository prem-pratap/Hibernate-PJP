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
			List <Object[]> result=dao.getCars();
			System.out.println("Cars Records with RegNo and Manufacturer:");
			for(Object[] obj:result) {
				System.out.println(obj[0]+" "+obj[1]);
			}
			
			

	}

}
