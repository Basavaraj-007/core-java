class IciciBank extends Bank{

     @Override
     public void getInterest(double interest) {

		System.out.print("The ICICI bank ");
         interest = interest + 3.5 ;
   
        super.getInterest(interest);
        
      }   
     }