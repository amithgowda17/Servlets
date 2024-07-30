package com.src.xworkz.chairservlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(loadOnStartup = 1,urlPatterns = "/chair")
public class ChairServlet extends GenericServlet{
	
	public ChairServlet() {
		System.out.println("creating chair servlet object ");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("this service method of chair servlet class");
		
	}

}
