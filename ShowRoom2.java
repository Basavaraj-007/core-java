class ShowRoom2
{
	//instance Variables
int id;
static String name;
static int noOfBranches;
String location;
long contactNo;
//parameterized constructor
public ShowRoom2(int id, String location ,long contactNo,String name,int noOfBranches)
{
System.out.println("ShowRoom2 Object is Created");
this.id= id;
this.location= location;
this.contactNo= contactNo;
this.name = name;
this.noOfBranches = noOfBranches;
}
public static void main(String a[])
{
ShowRoom2 show = new ShowRoom2(21,"bommanalli",9998755465l,"Mahindra",65);
/*show.showRoomId=21;
show.location = "bommanalli";
show.contactNo =9998755465l;*/
/*System.out.println("the show Room Id is "+show.showRoomId);
System.out.println("the Show room Name is "+ShowRoom2.name);
System.out.println("the no Of Branches are "+ShowRoom2.noOfBranches);
System.out.println("the Show room location is "+show.location);
System.out.println("the Show room contactNo is "+show.contactNo);*/
System.out.println(show.id +"  "+ show.location+"   "+show.contactNo+"  "+show.name+"  "+show.noOfBranches);
//System.out.println(ShowRoom2.name+"   "+ShowRoom2.noOfBranches);
System.out.println("----------------");
ShowRoom2 show2 = new ShowRoom2(22,"Kormangla",9998755469l,"Mahindra",65);
System.out.println(show2.id +"  "+ show2.location+"   "+show2.contactNo+"  "+show2.name+"  "+show2.noOfBranches);
//System.out.println(ShowRoom2.name+"   "+ShowRoom2.noOfBranches);



/*show2.showRoomId=22;
show2.location = "Kormangla";
show2.contactNo =9998755469l;*/

/*System.out.println("the Show room id is "+show2.showRoomId);
System.out.println("the Show room Name is "+ShowRoom2.name);
System.out.println("the no of branches "+ShowRoom2.noOfBranches);
System.out.println("the Show room location is "+show2.location);
System.out.println("the Show room Name contactNo is "+show2.contactNo);*/
}
}