class Multiplication
{
public static void main(String a[])
{
	//invoking a method
	//methodName(arguments1,arguments2);
int multiplyWithTwoNumbers=mul(25,35);
System.out.println(multiplyWithTwoNumbers);

int multiplyWithFourNumbers= mul(12,36,22,34);
System.out.println(multiplyWithFourNumbers);

//int value2= mul(24,22);
//System.out.println(value2);

}
//method declaration
public static int mul(int a,int b)
{
 return a*b;
}
public static int mul(int a,int b,int c,int d)
{
	return a*b*c*d;
}
}
