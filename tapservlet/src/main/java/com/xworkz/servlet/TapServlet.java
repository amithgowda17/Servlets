package com.xworkz.servlet;

import java.io.IOException;

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

		String ref = req.getParameter("username");
		String ref1 = req.getParameter("password");
		System.out.println("username===" + ref);
		System.out.println("password===" + ref1);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String ref = req.getParameter("username");
		String ref1 = req.getParameter("password");
		System.out.println("username===" + ref);
		System.out.println("password===" + ref1);
	}
}
