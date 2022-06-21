class ShowRoom
{
	public ShowRoom()
	{
		System.out.println("ShowRoom object Created");
		System.out.println("----------------");
	}
	int id;
String name;
String address;
String ownerName;
long contactNo;
int noOfEmployees;
//String []availableCarsInShowRoom={"Glanza","Urban Cruiser","Innova","Fortuner"};
//String []availableCarsInShowRoom2={"swift","ciaz","Belano","vitara bezza"};
//String []availableCarsInShowRoom3={"xuv700","xuv500","xuv300","altrius G4"};
//String []availableCarsInShowRoom4={"creta","verna","venue","alcazar"};
public static void main(String a[])
{
ShowRoom showRoom = new ShowRoom();
showRoom.id = 50;
showRoom.name = "Toyota";
showRoom.address = "magadi road";
showRoom.ownerName = "basava";
showRoom.contactNo=9911225546l; 
showRoom.noOfEmployees = 15;
System.out.println("the showRoom id is "+showRoom.id);
System.out.println("showRoom name is "+showRoom.name);
System.out.println("the showRoom address is "+showRoom.address);
System.out.println("the showRoom ownerName is "+showRoom.ownerName);
System.out.println("the contactNo is "+showRoom.contactNo);
System.out.println("The no of employees in showRoom "+showRoom.noOfEmployees);
//showRoom.getavailableCarsInShowRoom();
System.out.println("---------------");

ShowRoom showRoom2 = new ShowRoom();
showRoom2.id = 51;
showRoom2.name = "Maruti Suzuki";
showRoom2.address = "Bommanalli";
showRoom2.ownerName = "Sagar";
showRoom2.contactNo = 6363456544l;
showRoom2.noOfEmployees = 10;
System.out.println("the ShowRoom2 id is "+showRoom2.id);
System.out.println("the showRoom2 name is "+showRoom2.name);
System.out.println("the showRoom2 address is "+showRoom2.address);
System.out.println("the showRoom2 ownerName is "+showRoom2.ownerName);
System.out.println("the showRoom2 contactNo is "+showRoom2.contactNo);
System.out.println("the showRoom2 noOfEmployees "+showRoom2.noOfEmployees);
//showRoom2.getavailableCarsInShowRoom2();
System.out.println("----------------------");

ShowRoom showRoom3 = new ShowRoom();
showRoom3.id = 52;
showRoom3.name = "Mahindra";
showRoom3.address = "Mico Layout";
showRoom3.ownerName = "Basavaraj";
showRoom3.contactNo = 9975684455l;
showRoom3.noOfEmployees = 20;
System.out.println("the showRoom3 id is "+showRoom3.id);
System.out.println("the showRoom3 name is "+showRoom3.name);
System.out.println("the showRoom3 address is "+showRoom3.address);
System.out.println("the showRoom3 ownerName is "+showRoom3.ownerName);
System.out.println("the showRoom3 contactNo is "+showRoom3.contactNo);
System.out.println("the showRoom3 no of employees are "+showRoom3.noOfEmployees);
//showRoom3.getavailableCarsInShowRoom3();
System.out.println("----------------------");

ShowRoom showRoom4 = new ShowRoom();
showRoom4.id = 53;
showRoom4.name = "Hyundai";
showRoom4.address = "Gandhi nagar";
showRoom4.ownerName ="Manjunath";
showRoom4.contactNo =9111523322l;
showRoom4.noOfEmployees= 9;
System.out.println("the showRoom4 id is "+showRoom4.id);
System.out.println("the showRoom4 name is "+showRoom4.name);
System.out.println("the showRoom4 address is "+showRoom4.address);
System.out.println("the showRoom4 ownerName is "+showRoom4.ownerName);
System.out.println("the showRoom4 contactNo is "+showRoom4.contactNo);
//showRoom4.getavailableCarsInShowRoom4();
System.out.println("***************");
}
//public  void getavailableCarsInShowRoom()
//{
	//for(int z=0;z < availableCarsInShowRoom.length;z++)
	//{
		//System.out.println(availableCarsInShowRoom[z]);
	//}
//}
//public void getavailableCarsInShowRoom2()
//{
	//for(int y=0;y < availableCarsInShowRoom2.length;y++)
	//{
		//System.out.println(availableCarsInShowRoom2[y]);
	//}
//}
//public void getavailableCarsInShowRoom3()
//{
	//for(int x=0;x < availableCarsInShowRoom3.length;x++)
	//{
		//System.out.println(availableCarsInShowRoom3[x]);
	//}
//}
//public void getavailableCarsInShowRoom4()
//{
	//for(int m=0;m < availableCarsInShowRoom4.length;m++)
	//{
		//System.out.println(availableCarsInShowRoom4[m]);
	//}
//}
}