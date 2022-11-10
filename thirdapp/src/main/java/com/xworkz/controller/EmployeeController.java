package com.xworkz.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.EmployeeDTO;
import com.xworkz.service.EmployeeService;

public class EmployeeController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("---------controller logic----------");
		
		/*String id=req.getParameter("id");
		Integer idint=Integer.parseInt(id);*/
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String passwoord=req.getParameter("passwoord");
		
		EmployeeDTO dto = new EmployeeDTO();
		//dto.setId(idint);
		dto.setName(name);
		dto.setEmail(email);
		dto.setPasswoord(passwoord);
		
		//pass dto service class
		
		EmployeeService employeeService = new EmployeeService();
		
		boolean result = employeeService.saveEmployee(dto);
		
		if(result==true) {
		resp.getWriter().println("Data inserted successfull");

		
	}
		else {
			resp.getWriter().println("Data not inserted");
		}

	
	
}}
