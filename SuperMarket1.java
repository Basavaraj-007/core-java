class SuperMarket1
{
static String biscuits[]={"Oreo", "DarkFantasy", "HideandSeek", "Bourborn", "GoodDay", "MomsMagic", "ParleG"};
static String vegetables[]={"Tomato","Carrot","Potato","Ginger","Onion","Brocolli","Cocumber","Beans"};
static String sportItems[]={"Bat","Balls","Gloves","Legpads","Dumbells","SafetyGuard","volleyBall"};
static String deos[]={"KS","Wildstone","Spinz","Cobra","ParkAvenue","Denver","SetWet","Fogg"};
static String soaps[]={"Medimix","Pears","LifeBoy","MysoreSandal","Dove","Rin","Win"};
static String coolDrinks[]={"Pepsi","Cocacola","ThumpsUp","7up","Sprite","Sting","MountenDew"};
static String fruits[]={"gouva","Apple","orange","waterMelon","DragonFruit","Kiwi","Mangoes"};
static String chocolates[]={"Dairymilk","5Star","MilkyBar","Perk","munch","Snikers","KitKat",};
static String snacks[]={"MoongDall","Peanuts","Lays","Cheetos","Doritos","Kurkure","LittleHearts"};
static String electonicDevices[]={"washing machine","tv","Aircooler","Refrigerator","oven","Stablizer"};
static String grocerries[]={"sunfloweroil","Asharivad atta","Sugar","salt","pepper","mangopickle"};
static String giftItems[]= {"Doll","Teddybeer","photo frame","rose","watch"};
public static void main(String a[])
{
String value= getBiscuit("Maska Chaska");
System.out.println("come...will eat "+value);
String value1= getVegetable("Potato");
System.out.println("will do curry today "+value1);
String value2= getSportItem("Bat");
System.out.println("we buy new SportItem.....  "+value2);
String value3= getDeo("ParkAvenue");
System.out.println("I use always  "+value3);
String value4= getSoap("Pears");
System.out.println("the soap is  "+value4);	
String value5= getCoolDrink("7up");
System.out.println("I drink Always "+value5);
String value6= getFruit("Apple");
System.out.println("Which Fruit Keeps A doctor Away..... "+value6);
String value7= getChocolate("5Star");
System.out.println("my favorite Chocolate is.... "+value7);
String value8= getSnack("Lays");
System.out.println("my Childhood Evening Snacks is...."+value8);	
	String value9= getElectronicDevice("Washing Machine");
	System.out.println("The Electronic Device I want to Buy is..... "+value9);
	String value10= getGrocerrie("SunFlowerOil");
	System.out.println("The Grocerrie Item My Mom want to buy is.... "+value10);
	String value11= getGiftItem("Teddybeer");
	System.out.println("small kids favorite gift is .... "+value11);
	}
public static String getBiscuit(String biscuit)
{
	String Biscuit = null;
	for(int i=0;i<biscuits.length;i++)
	{
		if(biscuits[i] == biscuit)
		{
			biscuit = biscuits[i];
		}
		else
		{
			System.out.println(Biscuit + "  its not available");
		}
	}
	return Biscuit;
}
public static String getVegetable(String vegetable)
{	
	for(int i=0;i<vegetables.length;i++)
	{
		if(vegetables[i] == vegetable)
		{
			vegetable=vegetables[i];
		}
	}
	return vegetable;
}
public static String getSportItem(String sportItem)
{
	
	for(int i=0;i<sportItems.length;i++)
	{
		if(sportItems[i] == sportItem)
		{
			//sportItem=sportItems[i];
		}
}
	return sportItem;
}
public static String getDeo(String deo)
{	
	for(int i=0;i<deos.length;i++)
	{
		if(deos[i] == deo)
		{
			deo=deos[i];
		}
	}
	return deo;
}
public static String getSoap(String soap)
{	
	for(int i=0;i<soaps.length;i++)
	{
		if(soaps[i] == soap)
		{
			soap=soaps[i];
		}
	}
	return soap;
}
public static String getCoolDrink(String coolDrink)
{	
	for(int i=0;i<coolDrinks.length;i++)
	{
		if(coolDrinks[i] == coolDrink)
		{
			coolDrink=coolDrinks[i];
		}
	}
	return coolDrink;
}
public static String getFruit(String fruit)
{	
	for(int i=0;i<fruits.length;i++)
	{
		if(fruits[i] == fruit)
		{
			fruit=fruits[i];
		}
	}
	return fruit;
}
public static String getChocolate(String chocolate)
{	
	for(int i=0;i<chocolates.length;i++)
	{
		if(chocolates[i] == chocolate)
		{
			chocolate=chocolates[i];
		}
	}
	return chocolate;
}
public static String getSnack(String snack)
{	
	for(int i=0;i<snacks.length;i++)
	{
		if(snacks[i] == snack)
		{
			snack=snacks[i];
		}
	}
	return snack;
}
public static String getElectronicDevice(String electonicDevice)
{	
	for(int i=0;i<electonicDevices.length;i++)
	{
		if(electonicDevices[i] == electonicDevice)
		{
			electonicDevice=electonicDevices[i];
		}
	}
	return electonicDevice;
}
public static String getGrocerrie(String grocerrie)
{	
	for(int i=0;i<grocerries.length;i++)
	{
		if(grocerries[i] == grocerrie)
		{
			grocerrie=grocerries[i];
		}
	}
	return grocerrie;
}
public static String getGiftItem(String giftItem)
{	
	for(int i=0;i<giftItems.length;i++)
	{
		if(giftItems[i] == giftItem)
		{
			giftItem=giftItems[i];
		}
	}
	return giftItem;
}
}