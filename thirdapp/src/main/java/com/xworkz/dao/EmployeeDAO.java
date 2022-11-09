package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.dto.EmployeeDTO;

public class EmployeeDAO {

//in springboot dao is called repository 	
public boolean saveEmployee(EmployeeDTO dto) {
		
	System.out.println("------------DAO--------------");
	String url="jdbc:mysql://localhost:3306/basavaraj";
	String username="root";
	String password="Xworkzodc@123";
	int result=0;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection(url, username, password);
		PreparedStatement psmt=connection.prepareStatement("insert into emp values(?,?,?,?)");
		
		psmt.setInt(1, dto.getId());
		psmt.setString(2, dto.getName());
		psmt.setString(3, dto.getEmail());
		psmt.setString(4, dto.getPasswoord());
		
		 result=psmt.executeUpdate();
		
	
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("------------return to caller (service class) --------------");

	return result>=1 ? true :false;
	}
}
