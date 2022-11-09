package com.xworkz;

import java.io.IOException;
import java.time.Instant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("------hello------");
		Instant instant = Instant.now();
		
		String msg = "welcome to xworkz---" +instant.toString();
		System.out.println("message " +msg);
		
		resp.getWriter().println("message : " +msg);
}}
