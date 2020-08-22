package com.wipro.service;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Transaction;

import org.hibernate.Session;

import com.wipro.bean.Employee;
import com.wipro.util.EmployeeUtil;

public class EmployeeAdmin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Session session = EmployeeUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Employee empObj=new Employee(8965,"Akshay","Manager",7839,df.parse("22-08-92"),2975,200,20);
		session.save(empObj);
		transaction.commit();
		session.close();
		System.out.println("Record Inserted");
		System.out.println(empObj);

	}

}
