class Npr
{
public static void main(String a[])
{
int npr=fact(5)/fact(5-3);
System.out.println(npr);
}
public static int fact(int factNmuber)
{


int f=1;
for(int i=1;i<=factNmuber;i++)
{
f=f*i;
}
return f;
}
}