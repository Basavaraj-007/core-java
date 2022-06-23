class WorldCup
{
String wcLoc;
int wcYear;
String teamCap;
String worldCupWinner;
static String n;
public WorldCup()

{
this("India",2011,"MSDhoni","India");
System.out.println("WorldCup object is created");
}
public WorldCup(String wcLoc,int wcYear,String teamCap,String worldCupWinner)
{
this.wcLoc=wcLoc;
this.wcYear=wcYear;
this.teamCap=teamCap;
this.worldCupWinner=worldCupWinner;
}
public static void main(String a[])
{
WorldCup wc= new WorldCup();
System.out.println("the WorldCup location is : "+wc.wcLoc+","+"the WorldCup year is :"+wc.wcYear+","+"the Captain of the team is :"+wc.teamCap+","+
"WInner of WorldCup 2011 is :"+wc.worldCupWinner);
}
}