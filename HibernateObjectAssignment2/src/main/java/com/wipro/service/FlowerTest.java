package com.wipro.service;

import com.wipro.DAO.FlowerDAO;

public class FlowerTest {

	public static void main(String[] args) {
		FlowerDAO ftest=new FlowerDAO();
		String r1=ftest.deleteFlower("02");
		String r2=ftest.deleteFlower("03");
		System.out.println(r1);
		System.out.println(r2);

	}

}
