package paramapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.Instant;

public class Insert_preparedStatement {

	
	public static void main(String [] args) {
		
		
	}
	
	static void prepareStatement() {
		
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
			
		PreparedStatement pstmst =   con.PreparedStatement();
		
		Instant startTime=Instant.now();
		System.out.println("-------------StartTime--------------"+startTime);
		//step4
		pstmst.execute("insert into " + " xworkz.employee values(101,'Raja')");

		Instant endTime=Instant.now();
		System.out.println("-----------------endTime------------"+endTime);

		

		//step5 : close
		con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
		
	
	
	static void statement() {
		
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
		
		Instant startTime=Instant.now();
		System.out.println("-------------StartTime--------------"+startTime);
		//step4
		st.execute("insert into " + " xworkz.employee values(101,'Raja')");

		Instant endTime=Instant.now();
		System.out.println("-----------------endTime------------"+endTime);

		

		//step5 : close
		con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}



