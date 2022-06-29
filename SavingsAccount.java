class SavingsAccount extends Baccount{
double interestRate;
public SavingsAccount(double interestRate)
{
//Super () will be called by compiler
this.interestRate= interestRate;
}
//calculate 
public double periodicInterest(){
double interest = getBalance() * interestRate/100;
deposit(interest);
return interest;


}



}