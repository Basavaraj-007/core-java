/*class HospitalTester{
public static void main(String a[]){
Hospital hos = new Hospital();
PatientDTO dto = new PatientDTO();
dto.setGender(Gender.male);
dto.setId(1);
dto.setName("Rama");
dto.setAddress("Rajajinagar");
dto.setContactNo(9113355789l);
hos.createPatient(dto);


		PatientDTO dto1 = new PatientDTO();
		dto1.setGender(Gender.female);
		dto1.setId(2);
		dto1.setName("Rani");
		dto1.setAddress("Belagavi");
		dto1.setContactNo(9879879870L);
		hos.createPatient(dto1);
		
		PatientDTO dto2 = new PatientDTO();
		dto2.setGender(Gender.male);
		dto2.setId(3);
		dto2.setName("Rahul");
		dto2.setAddress("Belagavi");
		dto2.setContactNo(9879879870L);
		hos.createPatient(dto2);
		
		PatientDTO dto3 = new PatientDTO();
		dto3.setGender(Gender.female);
		dto3.setId(4);
		dto3.setName("Radha");
		dto3.setAddress("Belagavi");
		dto3.setContactNo(9879879870L);
		hos.createPatient(dto3);
		
		PatientDTO dto4 = new PatientDTO();
		dto4.setGender(Gender.male);
		dto4.setId(5);
		dto4.setName("Ramesh");
		dto4.setAddress("Belagavi");
		dto4.setContactNo(9879879870L);
		hos.createPatient(dto4);
		
hos.getPatientDetails();
}
}*/




import java.util.Scanner ;

class HospitalTester{

  public static void main(String[] args){
	  
	 Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the number of Patients");      ///first we need to know size as we want that value at runtime
	  int size=sc.nextInt();

     
	 HospitalCrud hos=new HospitalCrud(size);   ///call size here as it is created with HospitalCrud  constr and init above
	 
	 for(int i=0;i<size;i++){      ///to opti code for loop used -no need to create object for each patient 
		 
	 PatientDTO dto=new PatientDTO();
	  System.out.println("Enter patient name");
	  String name=sc.next();
	  System.out.println("Enter Patient Address");
	  String address=sc.next();
	  System.out.println("Enter patient id");
	  int id=sc.nextInt();
	  System.out.println("Enter patient contact number");
	  long contactNo=sc.nextLong();
	 // System.out.println("Enter Patient Gender");
	 // Gender gender=sc.nextGender();
	  
	  
	 dto.setId(id);
	 dto.setName(name);
	 dto.setAddress(address);
	 //dto.setGender(gender);  ///enter value using enum class name i.e., Gender.male
	 dto.setContactNo(contactNo);
	 
	 hos.createPatient(dto);
	 }
	/* hos.getPatientDetails();
	 System.out.println("enter the existing id for address need to be change");
	 int existingId = sc.nextInt();
	 System.out.println("enter the address to be updated");
	 String updatedAddress = sc.nextLine();
	 
	 hos.updatePatientAddressById(existingId,updatedAddress);
	 
	 hos.getPatientDetails();   ///only one get details method called as it stores all the object details
	 
	 hos.getPatientDetails();
System.out.println("enter the existing name for contactNo need to br change");
String existingName = sc.next();
System.out.println("enter the number to be updated");
long updatedContactNo = sc.nextLong();

hos.updateContactNumberByPatientName(existingName,updatedContactNo);
hos.getPatientDetails();

hos.getPatientDetails();
System.out.println("enter the id for to show patient name");
int existingId1 = sc.nextInt();
System.out.println("the patient name by  Id");
String isPatientName = sc.next();

hos.getPatientNameById( existingId1);
hos.getPatientDetails();
//@Override
//public boolean getPatientNameById(int id){
	//return isPatientName;


/* ///invoking deletePatientDetailsByName()		
		 System.out.println("Enter the name to be deleted");
		 String availableName=sc.next();
		 hos.deletePatientDetailsByName(availableName);
		 
		 hos.getPatientDetails(); 
		 
	 ///invoking deletePatientDetailsById()		
		 System.out.println("Enter the id to be deleted");
		 int availableId=sc.nextInt();
		 hos.deletePatientDetailsById(availableId);
		 
		 hos.getPatientDetails(); 

}
		 }	*/
		 
		 String option = null;
		do{
			System.out.println("Enter 1 fetch all the Patients ");
			System.out.println("Enter 2 to update the patients Address by Id ");
			System.out.println("Enter 3 to update Patients Contact No by name ");
			System.out.println("Enter 4 to get name by patient id ");
			System.out.println("Enter 5 to get contactNo by patient name");
			System.out.println("Enter the Choise ");
			int choise = sc.nextInt();
			
			switch(choise){
				case 1 : hos.getPatientDetails();
				break;
				
				case 2 : System.out.println("Enter the Existing id for address has to be");
				        int existingId = sc.nextInt();
				        System.out.println("Enter the Address to be Updated");
				        String updatedAddress = sc.next();
			            hos.updatePatientAddressById(existingId,updatedAddress);
						break;
						
				case 3 : System.out.println("Enter the Existing name for Contact No has to be");
			             String existingName = sc.next();
			             System.out.println("Enter the Contact No to be Updated");
			             long updatedContactNo = sc.nextLong();
			             hos.updateContactNumberByPatientName(existingName , updatedContactNo);
						break;
				
				case 4 : System.out.println("enter the id for to show patient name");

						int existingId1 = sc.nextInt();
						System.out.println("the patient name by  Id");
						String isPatientName = sc.next();

						hos.getPatientNameById( existingId1);
						break;
						
				case 5 : System.out.println("enter the name for to show the patient contactNo");
						 String exstingName = sc.next();
						 //System.out.println("the patient contactNo by name");
						 long isPatientContactNo = sc.nextLong();
						 hos.getPatientContactNoByName(exstingName);
						 break;
				default : System.out.println("Given choise cannot be delivered");
                        break;				
			}
			System.out.println("Do you want to continue y/n ");
			option = sc.next();
		}
		while(option.equals("Y"));
	}
}	