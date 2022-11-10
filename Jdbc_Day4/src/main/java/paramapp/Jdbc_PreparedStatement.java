package paramapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_PreparedStatement {

	public static void main(String[] args) {
	
		try {
			Connection connection=DriverManager.getConnection(JdbcUtil.URL,JdbcUtil.USERNAME,JdbcUtil.PASSWORD);

		//step 3: 
			PreparedStatement pst = connection.prepareStatement( "insert into xworkz.student values(?,?,?,?)");
			pst.setInt(1, 99);
			pst.setString(2, "Budwiser");
			pst.setInt(3, 840);
			pst.setString(4, "Bangalore");
			
			
			
			//step 4:
			
			int count = pst.executeUpdate();
			System.out.println ("-------count----------------");
			
		connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

//aasignment:-

// wap to insert hospital data using PreparedStatement