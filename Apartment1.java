class Apartment1
{
String apartmentName;
int noOfFloors;
public Apartment1()
{
		this("Raj Towers",30);

System.out.println("Apartment Object Created");
}
public Apartment1(String apartmentName,int noOfFloors)
{

this.apartmentName=apartmentName;
this.noOfFloors=noOfFloors;
}
public static void main(String a[])
{
Apartment1 apart = new Apartment1();
System.out.println(apart.apartmentName+"  "+apart.noOfFloors);
}
}