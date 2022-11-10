package example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HospitalDTO dto=new HospitalDTO();
		
		HospitalDAO dao= new HospitalDAO();
		
		dto.setId(101);
		dto.setName("Suguna");
		dto.setAddress("Rajajinagar");
		
		dao.saveHospitalInfo(dto);
		
	}

}
