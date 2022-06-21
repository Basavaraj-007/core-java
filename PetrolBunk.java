class PetrolBunk
{
static String fuelType="Both Petrol and Disel"; 
String bunkName;
String petrolType;
int noOfBunks;
float price;

public PetrolBunk(String bunkName,String petrolType,int noOfBunks,float Price)
{
this.bunkName=bunkName;
this.petrolType=petrolType;
this.noOfBunks=noOfBunks;
this.price=Price;
}
public static void main(String a[])
{
PetrolBunk pBunk = new PetrolBunk("Indian Oil","Power petrol",2,101.50f);
System.out.println("the fuel Type is "+PetrolBunk.fuelType);
System.out.println(pBunk.bunkName+"  "+pBunk.petrolType+"  "+pBunk.noOfBunks+"  "+pBunk.price);

System.out.println("***************");

PetrolBunk pBunk1 = new PetrolBunk("HP","ExtraPremium petrol",3,107.50f);
System.out.println("the fuel Type is "+PetrolBunk.fuelType);
System.out.println(pBunk1.bunkName+"  "+pBunk1.petrolType+"  "+pBunk1.noOfBunks+"  "+pBunk1.price);
}
}