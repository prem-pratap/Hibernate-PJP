package com.wipro.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.bean.Employee;
import com.wipro.util.EmployeeUtil;



public class EmployeeService {
	public static void main(String[] args) {
		Session session = EmployeeUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Employee emp1=new Employee("Prem Pratap", "Engineer", 35000);
		Employee emp2=new Employee("Deepak", "Manager", 45000);
		Employee emp3=new Employee("Mayank", "Marketing", 30000);
		Employee emp4=new Employee("Twarit", "Engineer", 35000);
		Employee emp5=new Employee("Mishal", "Engineer", 35000);
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		transaction.commit();
		session.close();
		
	}

}
