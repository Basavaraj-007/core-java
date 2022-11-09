package Employee.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

	public void saveEmployeeInfo(EmployeeDto dto) {
		
		Connection con = JDBCConnectionUtil.getConnection();
		
		PreparedStatement pst;
		 
		try {
			pst= con.prepareStatement("insert into xworkz.bike values(?,?,?,?,?)");
			
			pst.setInt(1,dto.getBikeid());
			pst.setString(2,dto.getName());
			pst.setString(3,dto.getColor());
			pst.setInt(4, dto.getPrice());
			pst.setString(5,dto.getEngine());
			
			int count = pst.executeUpdate();
			System.out.println("------- insert one record-----"+ count);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
