class KarnatakaGraminBank extends Bank{

     @Override
     public void getInterest(double interest) {

		System.out.print("The KarnatakaGraminBank bank ");
         interest = interest + 4.1;
   
        super.getInterest(interest);
        }
         
     }