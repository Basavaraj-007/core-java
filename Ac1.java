class Ac1
{
static String brand="BlueStar";
static double cost=40000.00;
static String color="White";
static boolean isAcConnected;
static int maxTemprature = 5;
static int currentTemprature ;
static int minTemprature ;
public static void main(String a[])
{
	System.out.println("the brand name is :"+brand);
	System.out.println("the cost is :"+cost);
	System.out.println("the color is :"+color);
	System.out.println("isAcConnected :"+isAcConnected);
	onOrOff();
	increaseTemprature();
	increaseTemprature();
	increaseTemprature();
	increaseTemprature();
	increaseTemprature();
	decreaseTemprature();
	decreaseTemprature();
	decreaseTemprature();
	decreaseTemprature();
	decreaseTemprature();
	onOrOff();
}

public static void onOrOff()
{

System.out.println("Invoking onOrOff()");
if(isAcConnected == false)
{
isAcConnected = true;
System.out.println("Ac is turned Onn...Available to Connect");
}
else if(isAcConnected == true)
{
isAcConnected = false;
System.out.println("Ac is turned off..");
}

}

public static void increaseTemprature()
{
	System.out.println("Increase Temprature Method Started");
	if(isAcConnected == true)
	{
		System.out.println("Temprature is turned onn...");
		if(currentTemprature < maxTemprature)
		{
			currentTemprature = currentTemprature + 1;
			System.out.println("The Current Temprature is :"+currentTemprature);
		}
		else if(currentTemprature == maxTemprature)
		{
			System.out.println("Max Temprature Reached");
		}
	}
	else if(isAcConnected == false)
	{
		System.out.println("increaseTemprature method ended");
	}
}
	public static void decreaseTemprature()
	{
		System.out.println("Decrease Temprature Method Started");
		if(isAcConnected == true)
		{
			System.out.println("Ac is turned onn...");
			if(currentTemprature > minTemprature)
			{
				currentTemprature = currentTemprature - 1;
				System.out.println("the Current Temprature is :"+currentTemprature);
			}
			else if(currentTemprature == minTemprature)
			{
				System.out.println("Min Temprature reached");
			}				
		}
		else if(isAcConnected == false)
		{
			System.out.println("Gube Ac on Madu...");	
	}
				System.out.println("Decrease Temprature  method ended");

}
}