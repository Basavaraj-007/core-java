class MovieHub
{
static String movies[]={"Charlie 777","Vikram","BB2","prithviraj","major"};
public static void main(String a[])
{
String value= getMovie("Vikram");
System.out.println("come ...will watch "+value);
}


public static String getMovie(String movie)
{
	
	String movieName = null;
for(int i=0;i < movies.length;i++)
{
	if(movies[i] == movie)
	{
		movieName = movies[i];

}
}
return movieName;
}
}