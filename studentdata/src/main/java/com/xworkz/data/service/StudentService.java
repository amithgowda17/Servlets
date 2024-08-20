package com.xworkz.data.service;

import java.sql.SQLException;

import com.xworkz.data.dto.StudentDto;

public interface StudentService {
	
	String saveStudent(StudentDto dto) throws SQLException, Exception;

}
