class Theatre2
{
String name;
String address;
String []runningMovies= new String[3];
public static void main(String a[])
{
Theatre2 theatre = new Theatre2();
theatre.name="raj";
theatre.address= "rajajinagar";
theatre.runningMovies[0]="vikram";
theatre.runningMovies[1]="charlie";
theatre.runningMovies[2]="major";
System.out.println("the name of theatre is "+theatre.name);
System.out.println("the address of theatre is "+theatre.address);
theatre.getRunningMovies();
System.out.println("-------------------");

Theatre2 theatre1 = new Theatre2();
theatre1.name="raj";
theatre1.address= "rajajinagar";
theatre1.runningMovies[0]="vikram";
theatre1.runningMovies[1]="charlie";
theatre1.runningMovies[2]="major";
System.out.println("the name of theatre is "+theatre1.name);
System.out.println("the address of theatre is "+theatre1.address);
theatre1.getRunningMovies();
}
public void getRunningMovies()
{
for (int i=0;i<runningMovies.length;i++)
{
System.out.println(runningMovies[i]);
}
}
}