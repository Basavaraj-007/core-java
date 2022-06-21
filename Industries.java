class Industries
{
static String indName="Jayanth Group";
String oNmae;
String indType;
int noOfWorkers;
long contactNo;
String indLoc;

public Industries(String oName,String indType, int noOfWorkers, long contactNo, String indLoc)
{
	System.out.println("Industries Object Created");
oNmae=oName;
this.indType=indType;
this.noOfWorkers=noOfWorkers;
this.contactNo=contactNo;
this.indLoc=indLoc;
}
public static void main(String a[])
{
Industries industries = new Industries("DRKR","rice Industry",30,9686567526l,"Siruguppa");
System.out.println("The Industries Name is :"+Industries.indName);
System.out.println(industries.oNmae+"   "+industries.indType+"    "+industries.noOfWorkers+"    "+industries.contactNo+"    "+industries.indLoc);
System.out.println("-------------------");

Industries industries1 = new Industries("Shridhar","Cotton Industry",25,7676763546l,"Adoni");
System.out.println("The Industries Name is :"+Industries.indName);
System.out.println(industries1.oNmae+"  "+industries1.indType+"    "+industries1.noOfWorkers+"   "+industries1.contactNo+"   "+industries1.indLoc);
}
}