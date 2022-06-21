class Factorial
{
public static void main(String a[])
{
int factValue=fact(10);
System.out.println(factValue);


}
public static int fact(int factNumber)
{
	system.out.println("invoked fact()");
int f=1;
for(int i=1;i<=factNumber;i++)
{
f=f*i;
}
return f;
System.out.println("end of fact()");
}

}


