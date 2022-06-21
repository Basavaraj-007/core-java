class Library
{
String libName;
String libType;
static  String libCondition ="Maintain Silence";
static  String typeOfBooks ="All type of Books Available here";
int costOfLibCard;

public Library(String libName,String libType,int costOfLibCard)
{
this.libName=libName;
this.libType=libType;
this.costOfLibCard=costOfLibCard;
}
public static void main(String a[])
{
Library library = new Library("Gain Knowleadge","Public Library",200);
System.out.println(library.libName+"   "+library.libType+"    "+library.costOfLibCard);
System.out.println(Library.libCondition+"   "+Library.typeOfBooks);

System.out.println("---------------------");

Library library1 = new Library("Power Of Books","Oxford Collage Library",150);
System.out.println(library1.libName+"   "+library1.libType+"    "+library1.costOfLibCard);
System.out.println(Library.libCondition+"   "+Library.typeOfBooks);
}
}