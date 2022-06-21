class WashingMachine1
{
static String brandName="LG";
static String color="Grey";
static String type="TopLoad";
static double price=35000.00;
static boolean isRunning;
public static void main(String a[])
{
		System.out.println("the brandName is :"+brandName);
System.out.println("the color is :"+color);
System.out.println("the type is :"+type);
System.out.println("the price is :"+price);
System.out.println("isRunning :"+isRunning);
	
	onOrOff();
onOrOff();
}
public static void onOrOff()
{
System.out.println("Invoking onOrOff");
if(isRunning == false)
{
isRunning = true;
System.out.println("WashingMachine is onn...");
}
else if(isRunning == true)
{
isRunning = false;
System.out.println("WashingMachine is off....");
}



	
	



}
}