class Bar
{
	String name;
	String address;
	long contactNo;
	String []availableDrinksInBar={"KingFisher","Teacher","Tuborg"};
	String []availableDrinksInBar1={"Nok Air","Bellin","Mimosa"};
	String []availableDrinksInBar2={"Black & White","Jim beam","Royal Stag"};
	public static void main(String a[])
	{
		Bar bar = new Bar();
bar.name = "Classic";
bar.address = "magadi road";
bar.contactNo=9911225546l; 

System.out.println("bar name is "+bar.name);
System.out.println("the bar address is "+bar.address);
System.out.println("the  bar contactNo is "+bar.contactNo);
System.out.println("available Drinks In Bar");
bar.getavailableDrinksInBar();
System.out.println("---------------");

Bar bar1 = new Bar();
bar1.name = "JetLag";
bar1.address = "Bommanalli";
bar1.contactNo = 6363456544l;
System.out.println(bar1.name);
System.out.println(bar1.address);
System.out.println(bar1.contactNo);
System.out.println("available Drinks In Bar1");
bar1.getavailableDrinksInBar1();
System.out.println("----------------------");

Bar bar2 = new Bar();
bar2.name = "SherLocks";
bar2.address = "Mico Layout";
bar2.contactNo = 9975684455l;
System.out.println(bar2.name);
System.out.println(bar2.address);
System.out.println(bar2.contactNo);
System.out.println("available Drinks In Bar2");
bar2.getavailableDrinksInBar2();
System.out.println("----------------------");
	}
	public  void getavailableDrinksInBar()
{
	for(int z=0;z < availableDrinksInBar.length;z++)
	{
		System.out.println(availableDrinksInBar[z]);
	}
}
public void getavailableDrinksInBar1()
{
			

	for(int y=0;y < availableDrinksInBar1.length;y++)
	{
		System.out.println(availableDrinksInBar1[y]);
	}
}
public void getavailableDrinksInBar2()
{
	for(int x=0;x < availableDrinksInBar2.length;x++)
	{
		System.out.println(availableDrinksInBar2[x]);
	}
}
}