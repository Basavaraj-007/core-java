package example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.xworkz.JDBCConnectionUtil;

public class HospitalDAO {

	
	public void saveHospitalInfo(HospitalDTO dto) {
		

		Connection connection=JDBCConnectionUtil.getConnection();
		
		try {
			PreparedStatement pst = connection.prepareStatement("insert into  basavaraj.hospital values(?,?,?)");
				
			pst.setInt(1, dto.getId());
			pst.setString(2, dto.getName());
			pst.setString(3, dto.getAddress());
			
			int count=pst.executeUpdate();
			System.out.println("-------record inserted------"+count);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}
