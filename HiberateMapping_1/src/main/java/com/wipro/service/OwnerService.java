package com.wipro.service;

import com.wipro.bean.CarDetails;
import com.wipro.bean.OwnerDetail;
import com.wipro.dao.OwnerDao;

public class OwnerService {

	public static void main(String[] args) {

			CarDetails carobj=new CarDetails("RJ14", "BX 892", "Black", "Tata");
			OwnerDetail ownerobj=new OwnerDetail(2877, "Mayank", carobj);
			OwnerDao dao=new OwnerDao();
			System.out.println("Record: "+dao.addOwner(ownerobj));

	}

}
