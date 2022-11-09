package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_Day3 {
	public static void main(String[] args) {
		//url to connect mysql database
		//jdbc ---> main protocol
		//mysql ---->sub protocol
		//://localhost -->system name
		//(if we are connecting remote system then
		// in place of //localhost  we need give
		//ip address of remote system.
		//port---> mysql port number
		
		
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String pwd="Xworkzodc@123"; //mysql password
		
		
		//jdbc steps
		//step1 : load and register driver
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//step2: create connection
			Connection con=DriverManager.getConnection(url, username, pwd);
			
			//step3: create statement object
			
		Statement st = con.createStatement();
		//step4
		st.execute("insert into " + " xworkz.employee values(101,'Raja')");
		

		//step5 : close
		con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//----- 1.create helper(create car) method to create object of class I20(method drive(),running(),stop()
	//---2.same helper method should create another type car object
	
}
