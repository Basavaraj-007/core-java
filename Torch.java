class Torch
{
static String torchName="Philips";
static String torchColor="Blue";
static double torchCost=2000.00;
static String torchType="SmartTouch";
static boolean isTorchConnected;
public static void main(String a[])
{
System.out.println("the torchName is :"+torchName);
System.out.println("the torchColor is :"+torchColor);
System.out.println("the torchCost is :"+torchCost);
System.out.println("the torchType is :"+torchType);
onOrOff();
onOrOff();
}
public static void onOrOff()
{
System.out.println("Invoking onOrOff()");
if(isTorchConnected == false)
{
isTorchConnected = true;
System.out.println("torch is turned onn...");
}
else if(isTorchConnected == true)
{
isTorchConnected = false;
System.out.println("Torch is turned off...");
}
}
}