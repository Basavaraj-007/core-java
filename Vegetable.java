class Vegetable
{
String name;
int price;
public Vegetable()
{
System.out.println("Vegetable object is Created");
}
public Vegetable(String name,int price)
{
		this();
this.name=name;
this.price=price;
}
public static void main(String a[])
{
Vegetable v =new Vegetable("carrot",55);
System.out.println(v.name+"  "+v.price);
}
}