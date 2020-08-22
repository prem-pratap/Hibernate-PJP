package com.wipro.bean;

import java.util.Date;

public class Employee {
	
	private int empNo;
	private String empName;
	private String job;
	private int mgrNo;
	private Date hireDate;
	private int salary;
	private int commision;
	private int deptNo;
	
	public Employee(int empNo,String empName,String job,int mgrNo,Date date,int sal,int comm,int deptNo) {
		this.empNo=empNo;
		this.empName=empName;
		this.job=job;
		this.mgrNo=mgrNo;
		this.hireDate=date;
		this.salary=sal;
		this.commision=comm;
		this.deptNo=deptNo;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgrNo() {
		return mgrNo;
	}
	public void setMgrNo(int mgrNo) {
		this.mgrNo = mgrNo;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommision() {
		return commision;
	}
	public void setCommision(int commision) {
		this.commision = commision;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	public String toString() {
		return "Emp No.:"+empNo+" , Emp Name:"+empName+", Job:"+job+", MGR:"+mgrNo+", Hire Date:"+hireDate
				+", Salary:"+salary+", Commision:"+commision+", Department No.:"+deptNo;
		
		
	}
	
}
