package Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dao.JDBCConnectionUtil;

public class EmployeeDAO {

	public void saveEmployeeInfo() {
		String insertQuery = "insert into xworkz.employee values(?,?,?,?,?,?)";
		Connection con = JDBCConnectionUtil.getConnection();
		
		try {
			PreparedStatement pr = con.prepareStatement(insertQuery);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Employee Id : " );
			int employeeId = sc.nextInt();
			
			System.out.println("Enter Employee Name : ");
			String employeeName = sc.next();
			
			System.out.println("Enter gender : ");
			String gender = sc.next();
			
			System.out.println("Enter the Contact Number : ");
			long contactNo= sc.nextLong(); 
			
			System.out.println("Enter the Designation : ");
			String designation = sc.next();
			
			System.out.println("Enter the Job Location : ");
			String jobLocation = sc.next();
			
			pr.setInt(1,employeeId);
			pr.setString(2, employeeName);
			pr.setString(3, gender);
			pr.setLong(4, contactNo);
			pr.setString(5, designation);
			pr.setString(6, jobLocation);
			
			//step 4 : execute query
			int count =pr.executeUpdate();
			System.out.println("------Record Inserted------"+count);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getEmployeeInfo() {
		String selectSql = "SELECT*FROM xworkz.employee";
		
		Connection con = JDBCConnectionUtil.getConnection();
		
		try {
			PreparedStatement pr = con.prepareStatement(selectSql);
			ResultSet rs = pr.executeQuery(selectSql);
			while(rs.next()) {
				System.out.println("Employee Id :"+rs.getInt("Id"));
				System.out.println("Employee Name :"+rs.getString("EmployeeName"));
				System.out.println("Employee Gender :"+rs.getString("Gender"));
				System.out.println("Employee Contact Number :"+rs.getLong("ContactNo"));
				System.out.println("Employee Designation :"+rs.getString("Designation"));
				System.out.println("Employee Job Location :"+rs.getString("JobLocation"));}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void updateEmployeeInfo() {
		String insertQuery = "update xworkz.employee set EmployeeName='raju' where Id = 1";
		
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
	public void deleteEmployeeInfo() {
		String sqlUpdate = " delete from xworkz.employee where id = 15";
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
	

