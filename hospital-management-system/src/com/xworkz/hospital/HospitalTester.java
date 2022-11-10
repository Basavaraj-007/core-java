package com.xworkz.hospital;

import java.util.Scanner;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalTester {
	
	public static void main(String a[]) {
		
	Scanner sc  =new Scanner(System.in);
	System.out.println("Enter the number of Patients");      ///first we need to know size as we want that value at runtime
	  int size=sc.nextInt();

   
	 HospitalImpl hos=new HospitalImpl(size);   ///call size here as it is created with HospitalCrud  constr and init above
	 
	 for(int i=0;i<size;i++){   
	
	System.out.println("Enter the of paitentId");
	int id = sc.nextInt();
	System.out.println("Enter the patient name");
	String name= sc.next();
	System.out.println("Enter the address");
	String address = sc.next();
	System.out.println("Enter the Gender");
	String gender = sc.next();
	System.out.println("Enter the contact number");
	long contactNo = sc.nextLong();
	
	PatientDTO patient = new PatientDTO();
	patient.setId(id);
	patient.setName(name);
	patient.setAddress(address);
	patient.setGender(Gender.valueOf(gender));
	patient.setContactNo(contactNo);

	hos.createPatient(patient);
	 }
	
	
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
			sc.next();

					hos.getPatientNameById( existingId1);
					break;
					
			case 5 : System.out.println("enter the name for to show the patient contactNo");
					 String exstingName = sc.next();
					 System.out.println("the patient contactNo by name");
					   sc.nextLong();
					 hos.getPatientContactNoByName(exstingName);
					 break;
			default : System.out.println("Given choise cannot be delivered");
                    break;				
		}
		System.out.println("Do you want to continue y/n ");
		option = sc.next();
	}
	while(option.equals("Y"));
	sc.close();
}
	

	

	
}

