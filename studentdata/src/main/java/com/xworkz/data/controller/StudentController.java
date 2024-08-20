package com.xworkz.data.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.data.dto.StudentDto;
import com.xworkz.data.service.StudentService;
import com.xworkz.data.service.StudentServiceImpl;

@WebServlet(loadOnStartup = 1,urlPatterns = "/data")
public class StudentController extends HttpServlet{
	
	public StudentController() {
		System.out.println("StudentController object created");
	}
	
	
	StudentDto dto=new StudentDto();
	
	StudentService service=new StudentServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("sname");
		String quali=req.getParameter("qualification");
		String stream=req.getParameter("stream");
		String c_no=req.getParameter("phNo");
		
		dto.setSname(name);
		dto.setQualification(quali);
		dto.setStream(stream);
		dto.setPhNo(c_no);
		
		

		try {
			String ref;
			ref = service.saveStudent(dto);
			PrintWriter printWriter =resp.getWriter();
			printWriter.write(ref);
			resp.setContentType("text/plain");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
