class Speaker
{
static String brand="Zebronics";
static double cost=5000.00;
static String color="Blue";
static boolean isSpeakerConnected;
static int maxVolume = 5;
static int currentVolume ;
static int minvolume ;
public static void main(String a[])
{
	System.out.println("the brand name is :"+brand);
	System.out.println("the cost is :"+cost);
	System.out.println("the color is :"+color);
	System.out.println("isSpeakerConnected :"+isSpeakerConnected);
	onOrOff();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	onOrOff();
}

public static void onOrOff()
{

System.out.println("Invoking onOrOff()");
if(isSpeakerConnected == false)
{
isSpeakerConnected = true;
System.out.println("Speaker is turned Onn...Available to Connect");
}
else if(isSpeakerConnected == true)
{
isSpeakerConnected = false;
System.out.println("Speaker is turned off..");
}

}

public static void increaseVolume()
{
	System.out.println("Increase Volume Method Started");
	if(isSpeakerConnected == true)
	{
		System.out.println("Speaker is turned onn...");
		if(currentVolume < maxVolume)
		{
			currentVolume = currentVolume + 1;
			System.out.println("The Current volume is :"+currentVolume);
		}
		else if(currentVolume == maxVolume)
		{
			System.out.println("Max volume Reached");
		}
	}
	else if(isSpeakerConnected == false)
	{
		System.out.println("increaseVolume method ended");
	}
}
	public static void decreaseVolume()
	{
		System.out.println("Decrease volume Method Started");
		if(isSpeakerConnected == true)
		{
			System.out.println("Speaker is turned onn...");
			if(currentVolume > minvolume)
			{
				currentVolume = currentVolume - 1;
				System.out.println("the Current volume is :"+currentVolume);
			}
			else if(currentVolume == minvolume)
			{
				System.out.println("Min volume reached");
			}				
		}
		else if(isSpeakerConnected == false)
		{
			System.out.println("Gube Speaker on Madu...");	
	}
				System.out.println("Decrease volume method ended");

}
}