package com.wipro.service;

import java.util.Scanner;

import com.wipro.dao.FlowerDao;

public class FlowerTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter flower ID:");
		String fid=sc.next();
		System.out.println("Enter price:");
		int price=sc.nextInt();
		
		FlowerDao fdao=new FlowerDao();
		System.out.println(fdao.updateFlower(fid, price));
		fdao.showFlower(fid);

	}

}
