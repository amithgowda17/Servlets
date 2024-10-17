package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/index")
public class Matrimony extends HttpServlet {
	
	public Matrimony() {
		System.out.println("matrimony object created");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ref1=req.getParameter("caste");
		String ref2=req.getParameter("height");
		String ref3=req.getParameter("locality");
		
		Double a=Double.parseDouble(ref2);
		
	
		RequestDispatcher dispatcher=req.getRequestDispatcher("Response.jsp");
		
		if(a<7) {
			
			req.setAttribute("feet", "your preferenced height matched");
		}else {
			req.setAttribute("ifnot", "didn't find your match");
		}
		
		req.setAttribute("caste1", ref1);
		req.setAttribute("height1", ref2);
		req.setAttribute("locality1", ref3);
		
		dispatcher.forward(req, resp);
		
	}
}
