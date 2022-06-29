class BankOfIndiaBank extends Bank {


        @Override
     public void getInterest(double interest) {
		System.out.print("The Bank Of India Bank ");

         interest = interest + 5.5 ;
   
         super.getInterest(interest);
        
      }   
     }