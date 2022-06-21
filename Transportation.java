class Transportation
{
String transName;
String transType;
static String from="Singasandra";
static String to= "Rajajinagar";
int cost;

public Transportation(String transName,String transType,int cost)
{
System.out.println("Transportation object created");
this.transName=transName;
this.transType=transType;
this.cost=cost;
}
public static void main(String a[])
{
Transportation transport = new Transportation("Road","Bus",35);
System.out.println(transport.transName+"   "+transport.transType+"    "+transport.cost);
System.out.println(Transportation.from+"   "+Transportation.to);

System.out.println("--------------");

Transportation transport1 = new Transportation("Subway","Namma Metro",50);
System.out.println(transport1.transName+"   "+transport1.transType+"    "+transport1.cost);
System.out.println(Transportation.from+"   "+Transportation.to);
}
}