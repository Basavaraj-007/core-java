class ShoppingMall$
{
String name;
String address;
int noOfShops;
String []nameOfShopsInMall={"Peter England","Nike","Titan","Colorbar"};
String []nameOfShopsInMall2={"Max","Hugo Boss","Mango"};
String []nameOfShopsInMall3={"Adidas","Funmax 4D","Soch","Puma"};
String []nameOfShopsInMall4={"Van Heusen","SunGlass Hut","Us Polo"};
public static void main(String a[])
{
ShoppingMall$ shoppingMall = new ShoppingMall$();
shoppingMall.name = "LULU Hypermarket";
shoppingMall.address = "Rajajinagar";
shoppingMall.noOfShops = 4;
System.out.println("the ShopingMall name is "+shoppingMall.name);
System.out.println("the ShoppingMall address is "+shoppingMall.address);
System.out.println("the noOfShops in mall "+shoppingMall.noOfShops);
shoppingMall.getnameOfShopsInMall();
System.out.println("--------------------");

ShoppingMall$ shoppingMall2 = new ShoppingMall$();
shoppingMall2.name = "Orion Mall";
shoppingMall2.address = "Navarang";
shoppingMall2.noOfShops = 3;
System.out.println("the ShoppingMall2 name is "+shoppingMall2.name);
System.out.println("the ShoppingMall2 address is "+shoppingMall2.address);
System.out.println("the noOfShops in mall "+shoppingMall2.noOfShops);
shoppingMall2.getnameOfShopsInMall2();
System.out.println("@@@@@@@@@@@@@@@@@");

ShoppingMall$ shoppingMall3 = new ShoppingMall$();
shoppingMall3.name = "Garuda MAll";
shoppingMall3.address = "AshokNagar";
shoppingMall3.noOfShops = 4;
System.out.println("the ShopingMall name is "+shoppingMall3.name);
System.out.println("the ShoppingMall address is "+shoppingMall3.address);
System.out.println("the noOfShops in mall "+shoppingMall3.noOfShops);
shoppingMall3.getnameOfShopsInMall3();
System.out.println("--------------------");

ShoppingMall$ shoppingMall4 = new ShoppingMall$();
shoppingMall4.name = "Mantri mall";
shoppingMall4.address = "Sampige road";
shoppingMall4.noOfShops = 4;
System.out.println("the ShopingMall name is "+shoppingMall4.name);
System.out.println("the ShoppingMall address is "+shoppingMall4.address);
System.out.println("the noOfShops in mall "+shoppingMall4.noOfShops);
shoppingMall4.getnameOfShopsInMall4();
System.out.println("--------------------");
}
public  void getnameOfShopsInMall()
{
	for(int a=0;a < nameOfShopsInMall.length;a++)
	{
		System.out.println(nameOfShopsInMall[a]);	
	}
}
public  void getnameOfShopsInMall2()
{
	for(int b=0;b < nameOfShopsInMall2.length;b++)
	{
		System.out.println(nameOfShopsInMall2[b]);
	}
}
public  void getnameOfShopsInMall3()
{
	for(int c=0;c < nameOfShopsInMall3.length;c++)
	{
		System.out.println(nameOfShopsInMall3[c]);
	}
}
public  void getnameOfShopsInMall4()
{
	for(int d=0;d < nameOfShopsInMall4.length;d++)
	{
		System.out.println(nameOfShopsInMall4[d]);
	}
}
}