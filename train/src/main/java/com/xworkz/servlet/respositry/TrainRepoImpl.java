package com.xworkz.servlet.respositry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TrainRepoImpl implements TrainRepo{

	@Override
	public int train(String name, String password, String ph_no) throws Exception {
		
		
		String query="insert into pass_details values(?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/train","root","Xworkzodc@123");
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, ph_no);
		
		int response=preparedStatement.executeUpdate();
		return response;
	}

}
