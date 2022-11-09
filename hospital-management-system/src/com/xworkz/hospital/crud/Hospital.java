package com.xworkz.hospital.crud;

import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {

	public boolean createPatient(PatientDTO dto);
	public void getPatientDetails();
	public boolean updatePatientAddressById(int id , String address);
	public boolean updateContactNumberByPatientName(String name,long contactNo);
	public boolean getPatientNameById(int id);
	public boolean getPatientContactNoByName(String name);
	
}
