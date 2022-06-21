class Shopping
{
static String biscuits[]={"Oreo", "DarkFantasy", "HideandSeek", "Bourborn", "GoodDay", "MomsMagic", "ParleG"};
static String vegetables[]={"Tomato","Carrot","Potato","Ginger","Onion","Brocolli","Cocumber","Beans"};
static String sportItems[]={"Bat","Balls","Gloves","Legpads","Dumbells","SafetyGuard","volleyBall"};
static String soaps[]={"Medimix","Pears","LifeBoy","MysoreSandal","Dove","Rin","Win"};
static String coolDrinks[]={"Pepsi","Cocacola","ThumpsUp","7up","Sprite","Sting","MountenDew"};
static String fruits[]={"gouva","Apple","orange","waterMelon","DragonFruit","Kiwi","Mangoes"};
static String chocolates[]={"Dairymilk","5Star","MilkyBar","Perk","munch","Snikers","KitKat",};
static String snacks[]={"MoongDall","Peanuts","Lays","Cheetos","Doritos","Kurkure","LittleHearts"};
static String electronicDevices[]={"washing machine","tv","Aircooler","Refrigerator","oven","Stablizer"};
static String grocerries[]={"sunfloweroil","Asharivad atta","Sugar","salt","pepper","mangopickle"};
static String giftItems[]= {"Doll","Teddybeer","photo frame","rose","watch"};


public static void main(String a[])
{
getBiscuits();
getVegetables();
getSportItems();
getSoaps();
getCoolDrinks();
getFruits();
getChocolates();
getSnacks();
getElectronicDevices();
getGrocerries();
getGiftItems();
}
public static void getBiscuits()
{
					System.out.println("------------------");

	for(int i=0;i<biscuits.length;i++)
	{

		System.out.println(biscuits[i]);
	}
}
public static void getVegetables()
{
			System.out.println("-----------------------");

for (int i=0;i<vegetables.length;i++)
    {

	System.out.println(vegetables[i]);
    }	
}
public static void getSportItems()
{
	System.out.println("--------------------------");
	for(int i=0;i<sportItems.length;i++)
	{
		System.out.println(sportItems[i]);
	}
}
public static void getSoaps()
{
					System.out.println("------------------");
for (int i=0;i<soaps.length;i++)
{
	System.out.println(soaps[i]);
}
}
	public static void getCoolDrinks()
	{
		System.out.println("--------------------");
		for(int i=0;i<coolDrinks.length;i++)
		{
			System.out.println(coolDrinks[i]);
		}
	}
	public static void getFruits()
	{
		System.out.println("=========================");
		for(int i=0;i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
		}
	}
	public static void getChocolates()
	{
		System.out.println("======================");
		for(int i=0;i<chocolates.length;i++)
		{
			System.out.println(chocolates[i]);
		}
	}
	public static void getSnacks()
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
		for(int i=0;i<snacks.length;i++)
		{
			System.out.println(snacks[i]);
		}
	}
	public static void getElectronicDevices()
	{
		System.out.println(".......................");
		for(int i=0;i<electronicDevices.length;i++)
		{
			System.out.println(electronicDevices[i]);
		}
	}
	public static void getGrocerries()
	{
		System.out.println("-----------------------");
		for(int i=0;i<grocerries.length;i++)
		{
			System.out.println(grocerries[i]);
		}
	}
	public static void getGiftItems()
	{
		System.out.println("*******************");
		for(int i=0;i<giftItems.length;i++)
		{
			System.out.println(giftItems[i]);
		}
	}
}