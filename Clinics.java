class Clinics{

      String name;
	  String address;
	  String headDoc;
	  long contactNo;
	  String[] availableServices = {"MRI Scan", "X-Ray"};
	  String[] availableServicesinclinic1 = {"UltraSoinic", "X-Ray"};
	  String[] availableServicesinclinic2 = {"UltraSoinic", "X-Ray" , "MRI Scan"};
	  
	  public static void main(String a[]){
	  
	  Clinics   clinic = new Clinics();
	  clinic.name = "Sharada";
	  clinic.address = "Nagasandra";
	  clinic.headDoc = "Mahesh Babu";
	  clinic.contactNo = 6786786780l;
	  
	  System.out.println("The Name of the Clinic is "+ clinic.name);
	  System.out.println("The Address of the Clinic is "+ clinic.address);
	  System.out.println("The Head Doctor of the Clinic is "+ clinic.headDoc);
	  System.out.println("The Contact Number of the Clinic is "+ clinic.contactNo);
      System.out.println("The Available Services of the Clinic are ");
	  clinic.getavailableServices();
	  System.out.println("---------------------------------");
	  
	  Clinics   clinic1  = new Clinics();
	  clinic1.name = "Ganesha";
	  clinic1.address = "Rajajinagara";
	  clinic1.headDoc = "Raghavendra";
	  clinic1.contactNo = 7897897891l;
	  
	  System.out.println("The Name of the Clinic is "+ clinic1.name);
	  System.out.println("The Address of the Clinic is "+ clinic1.address);
	  System.out.println("The Head Doctor of the Clinic is "+ clinic1.headDoc);
	  System.out.println("The Contact Number of the Clinic is "+ clinic1.contactNo);
      System.out.println("The Available Services of the Clinic are ");
	  clinic1.getavailableServicesinclinic1();
	  	  System.out.println("---------------------------------");

	  
	  Clinics   clinic2  = new Clinics();
	  clinic2.name = "Kubera";
	  clinic2.address = "K S layout";
	  clinic2.headDoc = "Raghav";
	  clinic2.contactNo = 9876543210l;
	  
	  System.out.println("The Name of the Clinic is "+ clinic2.name);
	  System.out.println("The Address of the Clinic is "+ clinic2.address);
	  System.out.println("The Head Doctor of the Clinic is "+ clinic2.headDoc);
	  System.out.println("The Contact Number of the Clinic is "+ clinic2.contactNo);
      System.out.println("The Available Services of the Clinic are ");
	  clinic2.getavailableServicesinclinic2();
	  	  System.out.println("---------------------------------");

	  
	  
	 }
      public void getavailableServices(){
		 for(int i=0; i <availableServices.length; i++) {
			System.out.println(availableServices[i]);
			}
			}
			
	  public void getavailableServicesinclinic1(){
		 for(int i=0; i <availableServicesinclinic1.length;i++){
		 System.out.println(availableServicesinclinic1[i]);
		 }
	  }
       public void getavailableServicesinclinic2(){
		 for(int i=0; i <availableServicesinclinic2.length;i++){
		 System.out.println(availableServicesinclinic2[i]);
		 }
	  }
}