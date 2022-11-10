package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dao.JDBCConnectionUtil;

public class Basavaraj_Student {

	public void saveStudentInfo() {
		String insertQuery = "insert into xworkz.basavastudent values(?,?,?,?,?,?)";
		Connection con = JDBCConnectionUtil.getConnection();
		
		try {
			PreparedStatement pr = con.prepareStatement(insertQuery);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Student Id : " );
			int StudentId = sc.nextInt();
			
			System.out.println("Enter Student Name : ");
			String StudentName = sc.next();
			
			System.out.println("Enter gender : ");
			String gender = sc.next();
			
			System.out.println("Enter the Student Marks : ");
			int marks= sc.nextInt(); 
			
			System.out.println("Enter the Student Section : ");
			String StudentSection = sc.next();
			
			System.out.println("Enter the Student Address : ");
			String address = sc.next();
			
			pr.setInt(1,StudentId);
			pr.setString(2, StudentName);
			pr.setString(3, gender);
			pr.setLong(4, marks);
			pr.setString(5, StudentSection);
			pr.setString(6, address);
			
			//step 4 : execute query
			int count =pr.executeUpdate();
			System.out.println("------Record Inserted------"+count);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getStudentInfo() {
		String selectSql = "SELECT*FROM xworkz.basavastudent";
		
		Connection con = JDBCConnectionUtil.getConnection();
		
		try {
			PreparedStatement pr = con.prepareStatement(selectSql);
			ResultSet rs = pr.executeQuery(selectSql);
			while(rs.next()) {
				System.out.println("Student Id :"+rs.getInt("Id"));
				System.out.println("Student Name :"+rs.getString("StudentName"));
				System.out.println("Student Gender :"+rs.getString("Gender"));
				System.out.println("Student Marks :"+rs.getInt("Marks"));
				System.out.println("Student Section :"+rs.getString("StudentSection"));
				System.out.println("Student Address :"+rs.getString("Address"));}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void updateStudentInfo() {
		String insertQuery = "update xworkz.basavastudent set StudentName='raju' where Id = 1";
		
		Connection con = JDBCConnectionUtil.getConnection();
		
		try {
			PreparedStatement pr = con.prepareStatement(insertQuery);
			
			int count = pr.executeUpdate();
			System.out.println("records updated :"+count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void deleteStudentInfo() {
		String sqlUpdate = " delete from xworkz.basavastudent where id = 1";
		Connection con = JDBCConnectionUtil.getConnection();
		try {
			PreparedStatement pr = con.prepareStatement(sqlUpdate);
			int count = pr.executeUpdate();
			System.out.println("Record deleted :"+count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
