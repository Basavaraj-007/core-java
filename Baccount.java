class Baccount
{
 double amount;
 double getBalance;


 public void deposit(double amt)
{
System.out.println("Invoked Deposit Method");
System.out.println("Amount to be deposit :"+amt);
System.out.println("Amount before deposit :"+ amount);
amount=amount+amt;
System.out.println("Amount After Deposit :"+ amount);
System.out.println("Ended Deposit Method");
}
public void withDraw(double amt)
{
	System.out.println("------------------");
	System.out.println("Invoked withDraw Method");
	System.out.println("Amount to be withDraw :"+amt);
	System.out.println("Amount before withDraw :"+amount);
	amount=amount-amt;
	System.out.println("Amount after withDraw :"+amount);
	System.out.println("End of withDraw");
}
public double getBalance()
{
	System.out.println("---------------------");
return amount;


}
public void transfer(double amount ,Baccount other)
{
	
	withDraw(amount);
	other.deposit(amount);
}
}