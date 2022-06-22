class BookMyMovie{

     String movies[] ;
	 String theaterName;
	 int noOfTickets;
	 static int ticketPrice = 400;
	 int totalNoOfTickets;
	 int totalTicketPrice;
	
	 String snacks[];
	 int noOfSnacks=120;
	 static int snacksPrice=50;
	 int snacksQuantity;
	
	public BookMyMovie(String theaterName, int totalNoOfTickets, String movies[],  String snacks[] )
	{
		this.theaterName = theaterName;
		this.totalNoOfTickets = totalNoOfTickets;
		this.movies = movies;
		this.noOfSnacks = noOfSnacks;
		this.snacks = snacks;
		System.out.println("bookMyMovie object created");
	}
	
	
	 
	 
	 public int showTime(int noOfTickets, String bookedBy, String movieName)
	 {
		  int totalTicketPrice = 0;
		  
		  System.out.println("the showTime method started");
		  System.out.println("The arg 1 "+ noOfTickets);
		  System.out.println("The arg 3 "+ bookedBy);
		  System.out.println("The arg 2 "+ movieName);
		  
	      for(int i = 0; i < movies.length;i++)
		  {
		      if(movieName == movies[i])
			  {  
			     System.out.println("the movie is matched");
				 
				 if(noOfTickets < totalNoOfTickets){
			    totalTicketPrice = ticketPrice * noOfTickets ;
                totalNoOfTickets = totalNoOfTickets - noOfTickets;
                System.out.println("for the movie "+ movieName +" The price of the booked tickets "+ totalTicketPrice +" Total available tickets "+ totalNoOfTickets +" Booked by "+ bookedBy );				
			  
			   
			  
			  }
		  
		       else {
			   System.out.println("The tickets are not available");
			   
			   }
			  }
		      else{
			     System.out.println("The movie is not available");
			  }
		  
		  }
	 
	 
	   return totalTicketPrice;
	 
	 }

   
      public int buySnacks(String snackName, int snacksQuantity,int seatNo){
		  
		  int totalSnacksPrice = 0;
		  System.out.println("The snackTime method is started");
		  System.out.println("The snacks name is  "+ snackName);
		  System.out.println("The quantity of the snacks "+ snacksQuantity);
		  System.out.println("the seat no is "+seatNo);
		  
		  
		  for(int i=0; i < snacks.length; i++)
		  {
			  if(snackName == snacks[i]){
				  System.out.println("the snack is matched ");
				  if(snacksQuantity < noOfSnacks)
				  {
					  totalSnacksPrice =  snacksPrice * snacksQuantity;
					  noOfSnacks = noOfSnacks - snacksQuantity;
					  System.out.println("The Snacks name : "+ snackName +"The price of the snacks "+ totalSnacksPrice +" Total no of  snacks available in the shop "+ noOfSnacks);
				  }
				  else{
					  System.out.println("Illa snacks illa");
				  }
			  }
			  else{
				  System.out.println("The snack is not available");
			  }
		  }
		  return totalSnacksPrice;
	  }

}