class Grinder
{
static String brand="Bajaj";
static double cost=15000.00;
static String color="Green";
static boolean isGrinderRunning;
static int maxSpeed = 4;
static int currentSpeed ;
static int minSpeed ;
public static void main(String a[])
{
	System.out.println("the brand name is :"+brand);
	System.out.println("the cost is :"+cost);
	System.out.println("the color is :"+color);
	System.out.println("isGrinderRunning :"+isGrinderRunning);
	onOrOff();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
	decreaseSpeed();
	decreaseSpeed();
	decreaseSpeed();
	decreaseSpeed();
	onOrOff();
}

public static void onOrOff()
{

System.out.println("Invoking onOrOff()");
if(isGrinderRunning == false)
{
isGrinderRunning = true;
System.out.println("Grinder is turned Onn...Available to Connect");
}
else if(isGrinderRunning == true)
{
isGrinderRunning = false;
System.out.println("Grinder is turned off..");
}

}

public static void increaseSpeed()
{
	System.out.println("Increase Speed Method Started");
	if(isGrinderRunning == true)
	{
		System.out.println("Grinder is turned onn...");
		if(currentSpeed < maxSpeed)
		{
			currentSpeed = currentSpeed + 1;
			System.out.println("The Current Speed is :"+currentSpeed);
		}
		else if(currentSpeed == maxSpeed)
		{
			System.out.println("Max Speed Reached");
		}
	}
	else if(isGrinderRunning == false)
	{
		System.out.println("increaseSpeed method ended");
	}
}
	public static void decreaseSpeed()
	{
		System.out.println("Decrease Speed Method Started");
		if(isGrinderRunning == true)
		{
			System.out.println("Grinder is turned onn...");
			if(currentSpeed > minSpeed)
			{
				currentSpeed = currentSpeed - 1;
				System.out.println("the Current Speed is :"+currentSpeed);
			}
			else if(currentSpeed == minSpeed)
			{
				System.out.println("Min Speed reached");
			}				
		}
		else if(isGrinderRunning == false)
		{
			System.out.println("Gube Grinder on Madu...");	
	}
				System.out.println("Decrease Speed method ended");

}
}