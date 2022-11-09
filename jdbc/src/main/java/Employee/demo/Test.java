package Employee.demo;

public class Test {

	public static void main(String[] args) {

		EmployeeDAO dao =new EmployeeDAO();
		
		EmployeeDto dto =new EmployeeDto();
		
		
		dto.setBikeid(100);
		dto.setName("Unicorn");
		dto.setColor("Silver");
		dto.setPrice(100000);
		dto.setEngine("Coolent Bs6");
		
		dao.saveEmployeeInfo(dto);
		
		
	}

}
