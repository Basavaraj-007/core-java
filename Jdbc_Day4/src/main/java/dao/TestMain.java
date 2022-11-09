package dao;

public class TestMain {

	public static void main(String[] args) {
		
		
		
		HospitalDao dao=new HospitalDao();

		
		
		HospitalDTO dto =new HospitalDTO();
		/*dto.setId(8);
		dto.setHospitalName("Suguna");
		dto.setHospitalAddress("K.C.Circle");
		dto.setHospitalContactNo(977886988);
		dto.setPatientName("Vaishanavi");
		dto.setPatientTokenNo(108);
		dto.setPatientAddress("Harishandra ghat");
		dto.setPatientAge(40);
		dto.setPatientContactNo(636463656);*/
		
		dao.saveHospitalInformation(dto);
		dao.getAllHospitalData();
		
	}}
