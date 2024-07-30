package com.src.xworkz.laptopservlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(loadOnStartup = 1,urlPatterns = "/lap")
public class LaptopServlet extends GenericServlet{
	
	
	public LaptopServlet() {
		System.out.println("LaptopServlet object created");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("this is service method in laptop servlet class");
		
	}

}
