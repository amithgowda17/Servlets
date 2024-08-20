package com.xworkz.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.service.TrainService;
import com.xworkz.servlet.service.TrainServiceImp;


@WebServlet(loadOnStartup = 1,urlPatterns = "/train")
public class TrainController extends HttpServlet{
	
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	public TrainController() {
		System.out.println("ProjectorController object created");
	}
	
	
	
	TrainService service=new TrainServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String ph_no=req.getParameter("ph_no");
		
		System.out.println("name=="+name);
		System.out.println("password=="+password);
		System.out.println("ph_no=="+ph_no);
		
		
		try {
			String ref;
			ref = service.saveTrain(name, password, ph_no);
			PrintWriter printWriter =resp.getWriter();
			printWriter.write(ref);
			resp.setContentType("text/plain");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
