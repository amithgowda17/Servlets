package com.xworkz.servlet.respositry;

import java.sql.SQLException;

public interface TrainRepo {
	
	int train(String name,String password,String ph_no) throws SQLException, Exception;

}
