class AccountTester{
public static void main(String a[])
{
SavingsAccount sa = new SavingsAccount(10.5);
sa.deposit(5000.00);
sa.withDraw(500.00);
sa.periodicInterest();
double amount = sa.getBalance();
System.out.println("Balance of existing Amount"+amount);


SavingsAccount other = new SavingsAccount(0.3);
sa.transfer(3000.00,other);

double totalAmount=other.getBalance();
System.out.println("Balance of other Amount "+totalAmount);

CurrentAccount ca = new CurrentAccount(20,1.2);
   ca.deposit(2000.00);
   ca.withDraw(500.00);
   ca.deposit(3000.00);
   ca.withDraw(1000.00);
   ca.deposit(2500.00);
   ca.withDraw(1500.00);
   ca.deductionOfFee();
   ca.periodicInterest();
   ca.getBalance();
}


}