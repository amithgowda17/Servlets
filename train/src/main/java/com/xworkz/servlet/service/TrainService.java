package com.xworkz.servlet.service;

import java.sql.SQLException;

public interface TrainService {
	
	
	String saveTrain(String name,String password,String ph_no) throws SQLException, Exception;

}
