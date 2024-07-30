package com.src.xworkz.carservlet;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(loadOnStartup =1,urlPatterns ="/car" )

public class CarServlet extends GenericServlet{
	
	public CarServlet() {
		System.out.println("car servlet object created");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("this is car servlet class");
		
	}

}
