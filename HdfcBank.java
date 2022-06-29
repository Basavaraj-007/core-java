class HdfcBank extends Bank {

     @Override
     public void getInterest(double interest) {


         interest = interest + 3.3 ;
   
        super.getInterest(interest);
      }  
         
     }