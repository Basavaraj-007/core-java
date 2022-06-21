//npr=n!/(n-r)!
//ncr=n!/r!(n-r)!
class Ncr
{
public static void main(String a[])
{
int ncr=fact(7)/(fact(2)* fact(7-2));
System.out.println(ncr);

}
public static int fact(int factNumber)
{
int f=1;
for(int i=1;i<=factNumber;i++)
{
f=f*i;
}
return f;
}




}