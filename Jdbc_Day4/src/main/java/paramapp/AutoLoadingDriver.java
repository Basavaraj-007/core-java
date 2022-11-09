package paramapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AutoLoadingDriver {

	public static void main(String [] args) {
		
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String pwd="Xworkzodc@123";
		
		//step1: JVM looks for file called java.sql.driver inside META-INF in mysql JAR.
		
		//direct Step2:
		
		try {
			Connection connection= DriverManager.getConnection(url,userName,pwd);
			//metadata means information of imformation to get additional about database,
			//then we use connection.getMataData() method
			System.out.println("-----------DB-------------" +connection.getMetaData().getDatabaseProductName());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
