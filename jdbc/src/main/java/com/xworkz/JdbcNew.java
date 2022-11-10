package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcNew {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String pwd="Xworkzodc@123";
		

	
	
	//step1: load and register driver
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		//step2: create connection
		
		Connection con=DriverManager.getConnection(url, userName, pwd);
		
		//step3: create statement
		
		PreparedStatement pst = con.prepareStatement( "insert into xworkz.bike values(?,?,?,?,?)");
		pst.setInt(1, 99);
		pst.setString(2, "Shine");
		pst.setString(3,"Black" );
		pst.setInt(4, 90000);
		pst.setString(5,"BS6");
	
		//Statement st = con.createStatement();
		
		//step4: execute sql query
		
	//	st.execute("insert into " + " xworkz.bike values(101,'Passion pro','Red',80000,'BS6')");
		int count= pst.executeUpdate();
		System.out.println("------------count---------");
		
		//step5: close
		
		con.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
