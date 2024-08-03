package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/tap")
public class TapServlet extends HttpServlet {

	public TapServlet() {
		System.out.println("tapservlet object created");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is get method");
		
		PrintWriter printWriter=resp.getWriter();
		
		resp.setContentType("text/html");
		
		printWriter.write("login successfull of get method");
		printWriter .write("<a href=index.html>click here for home</a>");

		String ref = req.getParameter("username");
		String ref1 = req.getParameter("password");
		String ref2=req.getParameter("gender");
		System.out.println("username===" + ref);
		System.out.println("password===" + ref1);
		System.out.println("gender===" + ref2);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		PrintWriter printWriter =resp.getWriter();
		
		resp.setContentType("text/plain");
		
		printWriter .write("login successfull for get method");
		printWriter .write("<h4>you are loggeed in</h1>");
		
		
		String ref = req.getParameter("username");
		String ref1 = req.getParameter("password");
		System.out.println("username===" + ref);
		System.out.println("password===" + ref1);
	}
}
