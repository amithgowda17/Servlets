package com.xworkz.data.service;

import java.sql.SQLException;

import com.xworkz.data.dto.StudentDto;
import com.xworkz.data.repository.StudentRepo;
import com.xworkz.data.repository.StudentRepoImple;

public class StudentServiceImpl implements StudentService {

	StudentRepo repo=new StudentRepoImple();
	
	
	@Override
	public String saveStudent(StudentDto dto) throws SQLException, Exception{
		
		System.out.println("Student name=="+dto.getSname());
		System.out.println("student qualification=="+dto.getQualification());
		System.out.println("student stream=="+dto.getStream());
		System.out.println("student phone number=="+dto.getPhNo());
		
		int dataSaved=repo.saveDetails(dto);
		
		if(dataSaved==1) {
			return "Data Saved Successfully....";
		}
		return "Data Not Saved!!!!!!";
	}

	
}
