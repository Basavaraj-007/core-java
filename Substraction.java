class Substraction
{
public static void main(String a[])
{
	
int substractionWithTwoNumbers=sub(97,74);
System.out.println(substractionWithTwoNumbers);

int substractionWithFourNumbers=sub(155,55,21,45);
System.out.println(substractionWithFourNumbers);

//int finalResult2=sub(95,66);
//System.out.println(finalResult2);
}

public static int sub(int a,int b)
{
return a-b;
}
public static int sub(int a,int b,int c,int d)
{
	return a-b-c-d;
}
}