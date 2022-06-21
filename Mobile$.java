class Mobile$
{
	public Mobile$()
	{
		System.out.println("Mobile$ object Created");
		System.out.println("----------------");
	}
int id;
String brandName;
String color;
float price;
String processorName;
String modelNo;
//String []availableMobilesInTheShop={"RedmiNote10pro","RedmiNote11i","RedmiNote11T","Redmi9i"};
//String []availableMobilesInTheShop1={"vivo v23","vivo v23pro","vivo y21","vivo zpro"};
//String []availableMobilesInTheShop2={"realmeNote7pro","realmeNote9","realmeNote8pro","realmeGtpro"};
//String []availableMobilesInTheShop3={"SamsungA51","SamsungM51","SamsungZfold3"};
public static void main(String a[])
{
Mobile$ mobile = new Mobile$();
mobile.id= 101;
mobile.brandName = "Xiomi ";
mobile.color = "Deep sea blue";
mobile.price= 25000;
mobile.processorName = "Octa-core Max2.05GHz";
mobile.modelNo = "M2101k7BI";
System.out.println("the mobile id is "+mobile.id);
System.out.println("mobile name is "+mobile.brandName);
System.out.println("the mobile color is "+mobile.color);
System.out.println("the mobile price is "+mobile.price);
System.out.println("the mobile processorName is "+mobile.processorName);
System.out.println("the mobile modelNo is "+mobile.modelNo);
//mobileShop.getavailableMobilesInTheShop();
System.out.println("---------------");

Mobile$ mobile1 = new Mobile$();
mobile1.id= 102;
mobile1.brandName = "vivo ";
mobile1.color = "Crystal White";
mobile1.price= 29000;
mobile1.processorName = "Octa-core Max1.50GHz";
mobile1.modelNo = "V22012VI";
System.out.println("the mobile id is "+mobile1.id);
System.out.println("mobile name is "+mobile1.brandName);
System.out.println("the mobile color is "+mobile1.color);
System.out.println("the mobile price is "+mobile1.price);
System.out.println("the mobile processorName is "+mobile1.processorName);
System.out.println("the mobile modelNo is "+mobile1.modelNo);
//mobileShop1.getavailableMobilesInTheShop1();
System.out.println("----------------------");

Mobile$ mobile2 = new Mobile$();
mobile2.id= 103;
mobile2.brandName = "RealMe ";
mobile2.color = "Matt Green";
mobile2.price= 35500;
mobile2.processorName = "Octa-core Max4.05GHz";
mobile2.modelNo = "R22015L1RE";
System.out.println("the mobile id is "+mobile2.id);
System.out.println("mobile name is "+mobile2.brandName);
System.out.println("the mobile color is "+mobile2.color);
System.out.println("the mobile price is "+mobile2.price);
System.out.println("the mobile processorName is "+mobile2.processorName);
System.out.println("the mobile modelNo is "+mobile2.modelNo);
//mobileShop2.getavailableMobilesInTheShop2();
System.out.println("----------------------");

Mobile$ mobile3 = new Mobile$();
mobile3.id= 104;
mobile3.brandName = "Samsang ";
mobile3.color = "Deep sea blue";
mobile3.price= 25000;
mobile3.processorName = "Octa-core Max2.05GHz";
mobile3.modelNo = "S210922OSA";
System.out.println("the mobile id is "+mobile3.id);
System.out.println("mobile name is "+mobile3.brandName);
System.out.println("the mobile color is "+mobile3.color);
System.out.println("the mobile price is "+mobile3.price);
System.out.println("the mobile processorName is "+mobile3.processorName);
System.out.println("the mobile modelNo is "+mobile3.modelNo);
//mobileShop3.getavailableMobilesInTheShop3();
System.out.println("***************");
}
//public  void getavailableMobilesInTheShop()
//{
	//for(int z=0;z < availableMobilesInTheShop.length;z++)
	//{
		//System.out.println(availableMobilesInTheShop[z]);
	//}
//}
//public void getavailableMobilesInTheShop1()
//{		
	//for(int y=0;y < availableMobilesInTheShop1.length;y++)
	//{
		//System.out.println(availableMobilesInTheShop1[y]);
	//}
//}
//public void getavailableMobilesInTheShop2()
//{
	//for(int x=0;x < availableMobilesInTheShop2.length;x++)
	//{
		//System.out.println(availableMobilesInTheShop2[x]);
	//}
//}
//public void getavailableMobilesInTheShop3()
//{
	//for(int m=0;m < availableMobilesInTheShop3.length;m++)
	//{
	//	System.out.println(availableMobilesInTheShop3[m]);
		//}
//}
}