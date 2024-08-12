package com.xworkz.servlet.service;

import java.sql.SQLException;

import com.xworkz.servlet.respositry.TrainRepo;
import com.xworkz.servlet.respositry.TrainRepoImpl;

public class TrainServiceImp implements TrainService{

	
	TrainRepo repo=new TrainRepoImpl();
	
	@Override
	public String saveTrain(String name, String password, String ph_no) throws SQLException, Exception {
		
		int isSaved=repo.train(name, password, ph_no);
		
		if(isSaved==1) {
			return "successfully saved";
		}
		return "Invalid data";
	}

}
