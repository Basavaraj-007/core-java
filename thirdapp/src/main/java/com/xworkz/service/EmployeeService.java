package com.xworkz.service;



import java.util.Random;

import com.xworkz.dao.EmployeeDAO;
import com.xworkz.dto.EmployeeDTO;

public class EmployeeService {

	EmployeeDAO dao = new EmployeeDAO();

	public boolean saveEmployee(EmployeeDTO dto) {

		System.out.println("-----service class--------------");
		
		//write business logic to generate id 
		Random random = new Random();
		int idNumber = random.nextInt() + 2 ;
		
		//setting random id to employee id
		dto.setId(idNumber);
		
		//passing dto to dao class.
		boolean result = dao.saveEmployee(dto);
		System.out.println("------return to controller------------");
		return result;
	
	
}}
