package com.wipro.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.CarDetails;
import com.wipro.dao.CarDao;

public class CarHQLTester {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			CarDao dao=new CarDao();
			//display all cars
			System.out.println("Enter Registration No.:");
			String rno=sc.next();
			List <CarDetails> result=dao.getCarDetail(rno);
			System.out.println("Cars Records:");
			for (CarDetails cobj:result)
				System.out.println(cobj);
			
			

	}

}
