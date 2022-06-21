class Shoe
{
String name;
int size;
String color;
String []typesOfShoeInShop={"Ultraboost DNA","4DWD pulse","Gazelle"};
String []typesOfShoeInShop1={"Clyde airbrush","Ralph Sampson"};
String []typesOfShoeInShop2={"Sm 680 Running Shoes","Sparks sports shoes"};
String []typesOfShoeInShop3={"Air force 1","Air max 90"};
public static void main(String a[])
{
Shoe shoe = new Shoe();
shoe.name = "Adidas";
shoe.size = 10;
shoe.color = "blue"; 
System.out.println("CompanyShoe name is "+shoe.name);
System.out.println("the sizeOfShoe is "+shoe.size);
System.out.println("the colorOfShoe is "+shoe.color);
shoe.gettypesOfShoeInShop();
System.out.println("---------------");

Shoe shoe1 = new Shoe();
shoe1.name = "Puma";
shoe1.size = 11;
shoe1.color = "Black and White";
System.out.println(shoe1.name);
System.out.println(shoe1.size);
System.out.println(shoe1.color);
shoe1.gettypesOfShoeInShop1();
System.out.println("----------------------");

Shoe shoe2 = new Shoe();
shoe2.name = "Sparks";
shoe2.size = 10;
shoe2.color = "Green";
System.out.println(shoe2.name);
System.out.println(shoe2.size);
System.out.println(shoe2.color);
shoe2.gettypesOfShoeInShop2();
System.out.println("----------------------");

Shoe shoe3 = new Shoe();
shoe3.name = "Nike";
shoe3.size = 10;
shoe3.color ="Wood coated ";
System.out.println(shoe3.name);
System.out.println(shoe3.size);
System.out.println(shoe3.color);
shoe3.gettypesOfShoeInShop3();
System.out.println("***************");
}
public  void gettypesOfShoeInShop()
{
	for(int z=0;z < typesOfShoeInShop.length;z++)
	{
		System.out.println(typesOfShoeInShop[z]);
	}
}
public void gettypesOfShoeInShop1()
{
			

	for(int y=0;y < typesOfShoeInShop1.length;y++)
	{
		System.out.println(typesOfShoeInShop1[y]);
	}
}
public void gettypesOfShoeInShop2()
{
	for(int x=0;x < typesOfShoeInShop2.length;x++)
	{
		System.out.println(typesOfShoeInShop2[x]);
	}
}
public void gettypesOfShoeInShop3()
{
	for(int m=0;m < typesOfShoeInShop3.length;m++)
	{
		System.out.println(typesOfShoeInShop3[m]);
	}
}
}