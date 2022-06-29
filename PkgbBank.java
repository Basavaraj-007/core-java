class PkgbBank extends Bank{

     @Override
     public void getInterest(double interest) {

		System.out.print("The Pkgb Bank ");
         interest = interest + 1.5 ;
   
        super.getInterest(interest);
        
      }   
     }