package com.xworkz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDAO {

public  void saveEmployeeInformation(EmployeeDTO dto) {
		
		
		
		Connection connection = JDBCConnectionUtil.getConnection();
		//step3:
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement("insert into xworkz.employee1 values(?,?,?,?,?)");

			pst.setInt(1, dto.getId());
			pst.setString(2, dto.getName());
			pst.setString(3,dto.getSalary());
			pst.setString(4,dto.getDateOfJoin());
			pst.setString(5,dto.getAddress());
	
			
			// step4
			int count = pst.executeUpdate();
			System.out.println("--------Inserted one record-------------" + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
}

public void getAllEmployeeDetails() {
	
	String selectQry="select * from xworkz.employee1";
	Connection connection = JDBCConnectionUtil.getConnection();
	
	try {
		PreparedStatement pst = connection.prepareStatement(selectQry);
	
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			
			EmployeeDTO dto = new EmployeeDTO();
			dto.setId(rs.getInt(1));
			dto.setName(rs.getString(2));
			dto.setSalary(rs.getString(3));
			dto.setDateOfJoin(rs.getString(4));
			dto.setAddress(rs.getString(5));

			System.out.println("----------all Employee Details--------"+dto.toString());
			
		}
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

public void updateEmployeeDataById( String dateOfJoin,int id) {
	
	String updateqry="update xworkz.employee1 set dateOfJoin=? where id=?";
	Connection connection = JDBCConnectionUtil.getConnection();
	
	try {
		PreparedStatement pst = connection.prepareStatement(updateqry);
	pst.setString(1,dateOfJoin);
	pst.setInt(2, id);
	int countofrows=pst.executeUpdate();
	System.out.println("----record updated----"+countofrows);
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	

}
public EmployeeDTO getEmployeeDataById(int id) {
	
	EmployeeDTO dto=new EmployeeDTO();
	String selectQry="select * from xworkz.employee1 where id=?";
	Connection connection=JDBCConnectionUtil.getConnection();
	
	try {
		PreparedStatement pstmt =connection.prepareStatement(selectQry);
		pstmt.setInt(1, id);
	ResultSet resultSet=pstmt.executeQuery();
	while(resultSet.next())
	{
		dto.setId(resultSet.getInt(1));
		dto.setName(resultSet.getString(2));
		dto.setSalary(resultSet.getString(3));
		dto.setDateOfJoin(resultSet.getString(4));
		dto.setAddress(resultSet.getString(5));
		
		
	}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return dto;
	}
}
