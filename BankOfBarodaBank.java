class BankOfBarodaBank extends Bank {

     @Override
     public void getInterest(double interest) {

		System.out.print("The Bank Of Baroda Bank ");
         interest = interest + 3.7;
   
        super.getInterest(interest);
        
      }   
     }