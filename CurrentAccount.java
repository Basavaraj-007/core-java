class CurrentAccount extends Baccount
{
static int count;
static int freeTransition =4;
double inte ;
double interestRate;

public CurrentAccount(double inte,double interestRate)
{
this.inte=inte;
this.interestRate=interestRate;
}
public void deposit(double amt)
{
System.out.println("Invoked Deposit Method");
System.out.println("Amount to be deposit :"+amt);
System.out.println("Amount before deposit :"+ amount);
amount=amount+amt;
System.out.println("Amount After Deposit :"+ amount);
System.out.println("Ended Deposit Method");
count++;
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
	count++;
}

 public void deductionOfFee() {
	  double transitionInte = 0;
	 
	  System.out.println("The deductionOfFee() started");
	  System.out.println("The total number of the count "+ count);
	  if(count > freeTransition) {
		  
		  transitionInte = inte * (count - freeTransition);
		 
		  withDraw(transitionInte);
		  
	  }
	   else {
		   getBalance();
	   }
	     System.out.println("The deductionOfFee() ended");
		  
		  
	  
  }
   
       public double periodicInterest() {
		   
		   
		    double interest = getBalance() * interestRate/100 ;
	   deposit(interest);
	   
	   return interest;
		   
	   }

}