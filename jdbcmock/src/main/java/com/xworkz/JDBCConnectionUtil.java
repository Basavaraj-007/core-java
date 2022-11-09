package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JDBCConnectionUtil {

	private JDBCConnectionUtil connectionUtil;
	private static Connection connection;
	private JDBCConnectionUtil() {
		
	}
	
	
	static {
		try {
			connection= DriverManager.getConnection(JdbcUtil.URL,JdbcUtil.USERNAME,JdbcUtil.PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static Connection getConnection(){
	
		
		
		return connection;
		
	}
	
}
