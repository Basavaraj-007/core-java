//creating CRUD operations

class HospitalCrud
{
/*//has many pateitns
PatientDTO[] dtos = new PatientDTO[5];
// instance variables
int index;*/

PatientDTO[] dtos;  ///if enter size >6 then nullpointerexception as patientdto is nonprimitive 
                                        ///and def value for it is null 
  ///instance variable
  int index; 
  
  public HospitalCrud(int size){             ///pass value which provided to the size in next line as we want to enter it at run time
	  dtos=new PatientDTO[size];    ///constr called as soon as object is called so init done here so size we need to provide first so done in constr
	  System.out.println("HospitalCrud object is created");
  }
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
public void getPatientDetails(){
	System.out.println("inside getPatientDetails()");
	for(int i=0; i<dtos.length;i++){
		System.out.println(dtos[i]);//.getId()+"   "+dtos[i].getName()+"  "+dtos[i].getAddress()+"  "+dtos[i].getContactNo());
	}
}
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
public boolean getPatientContactNoByName(String name){
	System.out.println("inside getPatientContactNoByName");
	boolean isPatientContactNoFound = false;
	for(int i=0;i<dtos.length;i++){
		if(dtos[i].getName() == name){
			System.out.println("Patient contact No is "+ dtos[i].getContactNo());
			isPatientContactNoFound = true;
		}
		else{
			System.out.println("patient contactNo not found");
		}
	}
	return isPatientContactNoFound;
	
}
 
 
 
 
 
 /*public boolean deletePatientDetailsByName(String name){
	  System.out.println("start of deletePatientDetailsById()");
	   boolean patientDeleted=false;
	   int i,j;
	     for(i=0,j=0;j<dtos.length;j++){
			 ///("Shree").equalsIgnoreCase("shree")  checks data but ignores for case sensitivity  
			 ///.equals -equals class has equals method so called using . ,for string values to compare we use .equals 
			if(!dtos[j].getName().equals(name)){				
			//	dtos[i]=null;  
				dtos[i++]=dtos[j];
				 patientDeleted=true;
            }
			else {
				System.out.println("Patient's name not found");
			}
		}	
	dtos = Arrays.copyOf(dtos,i);
	
				
	return patientDeleted;
   }

   public boolean deletePatientDetailsById(int id){
	   System.out.println("start of deletePatientDetailsById()");
	   boolean patientDeleted1=false;
	   int i,j;
	   for(i=0,j=0;j<dtos.length;j++){
		   if(dtos[j].getId()!=id){
			   dtos[i++]=dtos[j];
			   patientDeleted1=true;
		   }
		   else{
			   System.out.println("Patient id not found");
		   }
	   }
dtos = Arrays.copyOf(dtos,i);	   
	    return patientDeleted1;
   }*/   
  
}