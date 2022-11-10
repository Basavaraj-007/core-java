package com.xworkz.car;

import java.sql.Connection;
import java.sql.DriverManager;

public class CarTester{
	
//	[8:27 AM, 8/29/2022] Praveen2// Xworkz:
		
	public static void main(String[] args) {
		CarFactory  cf  = new CarFactory();
		
		System.out.println("<--------Car I20 Method started------->");
		Car i20 = CarFactory.createCar("I20");
		i20.stop();
		i20.running();
		i20.drive();
		System.out.println("<------Car I20 Method ended------->");
		
		System.out.println("<------Car Kia method started------->");
		Car kia = CarFactory.createCar("Kia");
		kia.stop();
		kia.running();
		kia.drive();
		System.out.println("<---------Car Kia method ended------->");
		
		
//		Connection mysqlCon =DriverManager.getConnection("mysqlurl");
//		Connection oracleCon =DriverManager.getConnection("oracleurl");
//		Connection poatgresCon =DriverManager.getConnection("postgresurl");
	}
	}
	//[8:28 AM, 8/29/2022] Praveen2 Xworkz: 
		package com.xworkz.car;

	

/*	public class Company {

		public static void main(String[] args) {
			
			String url = "jdbc:mysql://localhost:3306";
			String userName = "root";
			String password = "Xworkzodc@123";
			//step 1
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con=DriverManager.getConnection(url, userName, password);
				System.out.println(con.getClass().getName());
				
				
				java.sql.Statement st = con.createStatement();
				
				st.execute("insert into xworkz.company values(1,'wipro','banglore','7897897896')");


				con.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

}*/
