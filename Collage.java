class Collage
{
String collageName;
long contactNo;
public Collage()
{
System.out.println("Collage object Created");
}
public Collage(String collageName,long contactNo)
{
this();
this.collageName=collageName;
this.contactNo=contactNo;
}
public static void main(String a[])
{
Collage clg = new Collage("Oxford university",6364636585l);
System.out.println(clg.collageName+"   "+clg.contactNo);
}
}