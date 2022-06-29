class VishnuVillasBank extends Bank{

     @Override
     public void getInterest(double interest) {

		System.out.print("The Vishnu Villas Bank ");
         interest = interest + 2.9 ;
   
        super.getInterest(interest);
        }
         
     }
