package com.xworkz.hospital.crud.impl;

import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalImpl implements Hospital {
	
	

	
	
	/*//has many pateitns
	PatientDTO[] dtos = new PatientDTO[5];
	// instance variables
	int index;*/

	PatientDTO[] dtos;  ///if enter size >6 then nullpointerexception as patientdto is nonprimitive 
	                                        ///and def value for it is null 
	  ///instance variable
	  int index; 
	  
	  public HospitalImpl(int size){             ///pass value which provided to the size in next line as we want to enter it at run time
		  dtos=new PatientDTO[size];    ///constr called as soon as object is called so init done here so size we need to provide first so done in constr
		  System.out.println("HospitalCrud object is created");
	  }
	  
	  @Override
	public boolean createPatient(PatientDTO dto){
	System.out.println("inside createPatient");
	boolean isAdded = false;
	if (dto != null && dto.getName() != null){
		this.dtos[index++] = dto;
		isAdded=true;
		System.out.println("patient added successfully");
	}
	else {
		System.out.println("Cannot add patient.....");
	}
	return isAdded;
	}

	@Override
	public void getPatientDetails(){
		System.out.println("inside getPatientDetails()");
		for(int i=0; i<dtos.length;i++){
			System.out.println(dtos[i]);//.getId()+"   "+dtos[i].getName()+"  "+dtos[i].getAddress()+"  "+dtos[i].getContactNo());
		}
	}

	@Override
	public boolean updatePatientAddressById(int id , String address){
		System.out.println("inside updatePatientAddressById ()");
		boolean updatedAddress = false;
		for(int i =0;i<dtos.length;i++){
			if(dtos[i].getId()== id){
				dtos[i].setAddress(address);
				updatedAddress= true;
				System.out.println("address updated");
			}
			else{
				System.out.println("cannot updated address");
			}
		}
		return updatedAddress;
	}

	@Override
	public boolean updateContactNumberByPatientName(String name,long contactNo){
		System.out.println("inside updateContactNumberByPatientName()");
		boolean updatedContactNo = false;
		for(int i=0;i<dtos.length;i++){


		if(dtos[i].getName().equals(name)){
						updatedContactNo = true;

				dtos[i].setContactNo(contactNo);
				System.out.println("Contact Number updated");
			}
			else{
				System.out.println("plz updated number");
			}
		}
		return updatedContactNo;

	}

	@Override
	public boolean getPatientNameById(int id)
	{
	System.out.println("inside getPatientNameById()");
	boolean isPatientNameFound = false;
	for(int i=0;i<dtos.length;i++){
		if(dtos[i].getId()==id){
			System.out.println("patient name is "+		dtos[i].getName());
			isPatientNameFound = true;
		}
		else{
			System.out.println("patient name is not there");
		}
	}	
	return isPatientNameFound;
	}

	@Override
	public boolean getPatientContactNoByName(String name)
	{
		System.out.println("inside getPatientContactNoByName");
		boolean isPatientContactNo = false;
		for(int i=0;i<dtos.length;i++){
			if(dtos[i].getName() == name){
				System.out.println("Patient contact No is "+ dtos[i].getContactNo());
				isPatientContactNo = true;
			}

			else{
				System.out.println("patient contactNo not found");
			}
		}
		return isPatientContactNo;

	}
	}

