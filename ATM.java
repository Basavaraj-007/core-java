class ATM
{
	public ATM()
	{
		System.out.println("ATM object Created");
		System.out.println("----------------");
	}
int id;
String bankName;
String place;
String type;
int noOfMachines;
public static void main(String a[])
{
ATM atm = new ATM();
atm.id = 25;
atm.bankName = "HDFC Bank";
atm.place = "SingaSandra";
atm.type="WithDraw Machine";
atm.noOfMachines = 2;
System.out.println("the id of ATM is "+atm.id);
System.out.println("the Bank Name of ATM is "+atm.bankName);
System.out.println("The Location of ATM is "+atm.place);
System.out.println("the type of ATM is "+atm.type);
System.out.println("the no of machines in Atm "+atm.noOfMachines);
System.out.println("----------------------");

ATM atm1 = new ATM();
atm1.id = 20;
atm1.bankName = "Canara Bank";
atm1.place = "Bommanalli";
atm1.type = "WithDraw and Deposit Machine";
atm1.noOfMachines = 1;
System.out.println("The id Of ATM is "+atm1.id);
System.out.println("the Bank Name of Atm is "+atm1.bankName);
System.out.println("the Location of Atm is "+atm1.place);
System.out.println("the type of ATM is "+atm1.type);
System.out.println("the no of machines in Atm "+atm1.noOfMachines);
}
}