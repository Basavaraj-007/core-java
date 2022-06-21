class Fan1
{
static String fanName="Orient";
static String fanColor="Orange";
static double price=10000.00;
static String features="WifiConnected";
static boolean isWifiConnected;
static int maxSpeed = 5;
static int currentSpeed;
static int minSpeed;
public static void main(String a[])
{
System.out.println("the fanName is :"+fanName);
System.out.println("the fanColor :"+fanColor);
System.out.println("the price of fan is :"+price);
System.out.println("the features of fan is :"+features);
System.out.println("isWifiConnected :"+isWifiConnected);
onOrOff();
increaseSpeed();
increaseSpeed();
increaseSpeed();
increaseSpeed();
increaseSpeed();
increaseSpeed();
decreaseSpeed();
decreaseSpeed();
decreaseSpeed();
decreaseSpeed();
decreaseSpeed();
decreaseSpeed();
onOrOff();
}
public static void onOrOff()
{
System.out.println("Invoking onOrOff");
if(isWifiConnected == false)
{
isWifiConnected = true;
System.out.println("fan is on....");
}
else if(isWifiConnected == true)
{
isWifiConnected = false;
System.out.println("fan is off...");
}
}
public static void increaseSpeed()
{
	System.out.println("Increase Speed method started");
	if(isWifiConnected == true)
	{
		System.out.println("fan is on...");
		if(currentSpeed < maxSpeed)
		{
			currentSpeed = currentSpeed + 1;
			System.out.println("the currentSpeed is :"+currentSpeed);
		}
		else if(currentSpeed == maxSpeed)
		{
			System.out.println("maxSpeed is reached");
		}
	}
	else if(isWifiConnected == false)
	{
		System.out.println("increase Speed method ended");
	}
}
public static void decreaseSpeed()
{
	System.out.println("decrease Speed method started");
	if(isWifiConnected == true)
	{
		System.out.println("fan is on...");
		if(currentSpeed > minSpeed)
		{
			currentSpeed = currentSpeed - 1;
			System.out.println("the currentSpeed is :"+currentSpeed);
		}
		else if(currentSpeed == minSpeed)
		{
			System.out.println("minSpeed is reached");
		}
	}
	else if(isWifiConnected == false)
	{
		System.out.println("Fan off maadu");
	}
			System.out.println("decrease Speed method ended");

}
}