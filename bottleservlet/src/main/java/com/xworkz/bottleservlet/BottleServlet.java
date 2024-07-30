package com.src.xworkz.bottleservlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(loadOnStartup = 1,urlPatterns = "/bottle")
public class BottleServlet extends GenericServlet{
	
	public BottleServlet() {
		System.out.println("bottle servlet object created");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("this is service method of bottle servlet class");
		
	}

}
