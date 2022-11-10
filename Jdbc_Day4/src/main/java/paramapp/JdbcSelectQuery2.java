package paramapp;


	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class JdbcSelectQuery2 {

		public static void main(String [] args) {
			String selectSQL="Select StdName,StdRollNo,StdAddress from xworkz.student;";
			String url="jdbc:mysql://localhost:3306";
			String userName="root";
			String pwd="Xworkzodc@123";
			
			//STEP2:
			Connection con=null;
			
			try {
				con=DriverManager.getConnection(url, userName, pwd);
				
				//step3:
				Statement st=con.createStatement();
				
				//step4:always better to use execute Query
				//non-DML query(i.e.,select query
				//execute query will return result set interface 
				//ResultSet interface holds table data to check whether table has records are not
				//we use resultSet.next() if records are present
				//then resultSet.next() will return true else ...false
				//to get column data then we should use resultSet.getX(index number); X represent datatype
				//nwhile(rs.next())// next() method is boolean type, which returns true if //records are presennt 
				
				ResultSet resultSet= st.executeQuery(selectSQL);
				while(resultSet.next()) {
					
					//System.out.println("ID:"+resultSet.getInt(1));
					System.out.println("Name:"+resultSet.getString(1));
					System.out.println("RollNo:"+resultSet.getInt(2));
					System.out.println("Address:"+resultSet.getString("StdAddress"));
				}
				
				st.executeQuery(selectSQL);
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
