package paramapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_Hospital {

	public static void main(String[] args) {
		
		
		try {
			Connection connection = DriverManager.getConnection(JdbcUtil.URL,JdbcUtil.USERNAME,JdbcUtil.PASSWORD);
		
			PreparedStatement pst = connection.prepareStatement( "insert into basava.Hospital values(?,?,?,?,?,?,?)");
			pst.setInt(1, 01);
			pst.setString(2, "Sudhiksha Hospital");
			pst.setString(3,"Madivala");
			pst.setLong(4,994565656);
			pst.setInt(5, 101);
			pst.setString(6, "Raj");
			pst.setString(7, "Corporation");
			
			
			
			/*pst.setInt(1, 02);
			pst.setString(2, "TeeTree Hospital");
			pst.setString(3,"Koramangla");
			pst.setLong(4,886545659);
			pst.setInt(5, 102);
			pst.setString(6, "Manoj");
			pst.setString(7, "Nimhans");
			pst.setInt(8, 33);
			pst.setLong(9, 636363564);*/
		
			
			/*pst.setInt(1, 03);
			pst.setString(2, "Mallika Hospital");
			pst.setString(3,"Wilson Garden");
			pst.setLong(4,636345635);
			pst.setInt(5, 103);
			pst.setString(6, "Guru");
			pst.setString(7, "Bommanahalli");
			pst.setInt(8,35);
			pst.setLong(9, 969696869);*/
			
			int count = pst.executeUpdate();
			System.out.println ("-------count----------------");
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
