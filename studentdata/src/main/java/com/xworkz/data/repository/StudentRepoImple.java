package com.xworkz.data.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.data.dto.StudentDto;

public class StudentRepoImple implements StudentRepo{

	@Override
	public int saveDetails(StudentDto dto) throws Exception {

		String query="insert into student_details values(?,?,?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Xworkzodc@123");
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		preparedStatement.setString(1, dto.getSname());
		preparedStatement.setString(2, dto.getQualification());
		preparedStatement.setString(3, dto.getStream());
		preparedStatement.setString(4,dto.getPhNo());
		
		int response=preparedStatement.executeUpdate();
		return response;
		
	}

}
