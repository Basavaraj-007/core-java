package com.xworkz;

public class Test {

	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAO();
		
	//	EmployeeDTO dto = new EmployeeDTO();
		
		/*dto.setId(02);
		dto.setName("Basava");
		dto.setSalary(200000);
		dto.setDateOfJoin("25-07-2022");
		dto.setAddress("Ramnagar");*/
		
		//dao.saveEmployeeInformation(dto);
	//	dao.getAllEmployeeDetails();
		
		EmployeeDTO dto = dao.getEmployeeDataById(0);
		dto.setDateOfJoin("22-08-2022");
		dao.updateEmployeeDataById((dto.getDateOfJoin()), dto.getId());
		
		
	}

}
