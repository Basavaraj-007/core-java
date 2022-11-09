package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HospitalDao {

	public  void saveHospitalInformation(HospitalDTO dto) {
		
		
		
		Connection connection = JDBCConnectionUtil.getConnection();
		//step3:
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement("insert into basava.hospitalpatient values(?,?,?,?,?,?,?,?,?)");

			pst.setInt(1, dto.getId());
			pst.setString(2, dto.getHospitalName());
			pst.setString(3,dto.getHospitalAddress());
			pst.setLong(4,dto.getHospitalContactNo());
			pst.setString(5,dto.getPatientName());
			pst.setInt(6,dto.getPatientTokenNo());
			pst.setString(7,dto.getPatientAddress());
			pst.setInt(8,dto.getPatientAge());
			pst.setLong(9,dto.getPatientContactNo());
			
			// step4
			int count = pst.executeUpdate();
			System.out.println("--------Inserted one record-------------" + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
public void getAllHospitalData() {

		
		String selectQry = "select * from basava.hospital";
		Connection connection = JDBCConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(selectQry);

			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {

				HospitalDTO dto = new HospitalDTO();
				dto.setId(resultSet.getInt(1));
				dto.setHospitalName(resultSet.getString(2));
				dto.setHospitalAddress(resultSet.getString(3));
				dto.setHospitalContactNo(resultSet.getLong(4));
				dto.setPatientName(resultSet.getString(5));
				dto.setPatientTokenNo(resultSet.getInt(6));
				dto.setPatientAddress(resultSet.getString(7));
				dto.setPatientAge(resultSet.getInt(8));
				dto.setPatientContactNo(resultSet.getLong(9));
				

				System.out.println("-------------all data--------------"+dto.toString());

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		
	}
	
	public void updateHospitalInformation() {
		
		
	}
	
	public void deleteHospitalInformation() {
		
		
	}
}
