class Tv1
{
static String tvBrand="LG";
static String tvColor="red";
static double cost=35000;
static boolean isTvVisible;
public static void main(String a[])
{
System.out.println("The tvBrand is :"+tvBrand);
System.out.println("The tvColor is :"+tvColor);
System.out.println("The cost is :"+cost);
System.out.println("isTvVisible :"+isTvVisible);
onOrOff();
onOrOff();
}
public static void onOrOff()
{
System.out.println("Invoking onOrOff");
if(isTvVisible == false)
{
isTvVisible = true;
System.out.println("Tv is onn.....");
}
else if(isTvVisible == true)
{
isTvVisible = false;
System.out.println("tv is off....");
}
}
}