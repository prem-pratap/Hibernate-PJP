package com.wipro.bean;

public class Employee {
	
	private String empName;
	private int empId;
	private String designation;
	private int salary;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String eName,String desig,int salary) {
		
		this.empName=eName;
		this.designation=desig;
		this.salary=salary;
		
	}
	

}
