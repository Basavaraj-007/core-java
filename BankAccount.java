class BankAccount
{
static double amount ;
static double totalAmount ;

public static void main(String a[]){
	

System.out.println("main method started");
deposit(6700.00);
withDraw(6000.00);
totalAmount();

//deposit(12000.00);
//totalAmount();

deposit(28000.00);
withDraw(26000.00);
totalAmount();

deposit(37000.00);
withDraw(21000.00);
totalAmount();

deposit(12000.00);
withDraw(6000.00);
totalAmount();

deposit(22000.00);
withDraw(15000.00);
totalAmount();

deposit(50000.00);              //81700-33000=48700
withDraw(33000.00);
totalAmount();

deposit(22500.00);
withDraw(26000.00);
totalAmount();

deposit(100000.00);
withDraw(40000.00);
totalAmount();

deposit(82000.00);
withDraw(56000.00);
totalAmount();

deposit(50000.00);
withDraw(30000.00);
totalAmount();

totalAmount();
System.out.println("main method ended");
}

 static void deposit(double amt)

 
 {	
System.out.println("Invoked deposit()");

System.out.println("Amount to be deposit : "+ amt);

System.out.println("Amount before deposit : "+ amount);
amount=amount+amt;
System.out.println("Amount after deposit : "+ amount);
System.out.println("end of deposit()");
}

	
 static void withDraw(double amt)
 {
	 System.out.println("--------------------");
	 
	 System.out.println("Invoked withDraw()");
	 System.out.println("Amount before withDraw : "+ amount);

System.out.println("Amount to be withDraw : "+ amt);
amount=amount-amt;
System.out.println("Amount after withDraw :"+amount);
System.out.println("end of withDraw()");
 }
 static void totalAmount()
 {
	 System.out.println("-----------------------");

	 totalAmount=amount;
	 	 System.out.println("the totalAmount is :"+ totalAmount);


	 }
 }


