package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		System.out.println("caste==="+ref1);
		System.out.println("height==="+ref2);
		System.out.println("locality==="+ref3);
		
		PrintWriter printWriter=resp.getWriter();
		
	}

}
