package com.xworkz.data.repository;

import java.sql.SQLException;

import com.xworkz.data.dto.StudentDto;

public interface StudentRepo {
	
	int saveDetails(StudentDto dto) throws SQLException, Exception;

}
