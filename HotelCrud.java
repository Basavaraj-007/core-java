import java.util.Arrays;

class HotelCrud{

   FoodItemDto dtos[];
   int index;
   
   public HotelCrud(int size){
	   dtos=new FoodItemDto[size];
	   System.out.println("HotelCrud object created");
   }
   
   public boolean createFoodItem(FoodItemDto dto){
	   System.out.println("Start of createFoodItem()");
	    boolean isAdded=false;
	 if(dto!=null && dto.getName()!= null){
		 this.dtos[index++]=dto;
		 isAdded=true;
		 System.out.println("Food Item created succesfully");
	 }else{
		 System.out.println("Enter the Food item details first");
	 }
	 return isAdded;
	   
   }

    public void getFoodItem(){
	  System.out.println("Start of getFoodItem()");
	  for(int i=0;i<dtos.length;i++){
		  System.out.println(dtos[i]);
	  }
    }
	
  public boolean updatePriceById(int id,double price){    
	  System.out.println("start of updatePriceById()");
	  boolean updatedPrice=false;
	  for(int i=0;i<dtos.length;i++){      
		  if(dtos[i].getId()==id){        
			  updatedPrice=true;
			  dtos[i].setPrice(price);    
			  System.out.println("Price updated successfully");
		  }
		  else{
			  System.out.println("Couldnot update price,please provide proper id");
		  }
	  }
	  return updatedPrice;
  }
  
   public boolean updateIsAvailableByName(String name,boolean isAvailable){
	  System.out.println("start of updateIsAvailableByName()");
	  boolean updatedIsAvailable=false;
	  for(int i=0;i<dtos.length;i++){
		  if(dtos[i].getName().equals(name)){
			  updatedIsAvailable=true;
			  dtos[i].setIsAvailable(isAvailable);
			  System.out.println("isAvailable is updated successfully");
		  }
		  else{
			  System.out.println("Couldnot update isAvailable , please enter proper food item name");
		  }
	  }
	  return updatedIsAvailable;
  }
   public String[] getAllFoodItemName(){
		 System.out.println("Inside getAllFoodItemName ");
		 int i,j;
		 for( j=0,i=0;i<dtos.length;i++){ 
			  System.out.println(dtos[i].getName());
			  j++;
		 }
		    
		  String[] allFoodName = new String[j];
		   for(int k=0,m=0;k<dtos.length;k++){
			 allFoodName[m++] = dtos[k].getName(); 
		  }
           System.out.println("End getAllFoodItemName ");
		 return allFoodName;
	 }
	 
  
  
  
    /* public boolean deleteFoodItemDetailsById(int id){
	   System.out.println("start of deleteFoodItemDetailsById()");
	   boolean FoodItemDeleted=false;
	   int i,j;
	   for(i=0,j=0;j<dtos.length;j++){
		   if(dtos[j].getId()!=id){
			   dtos[i++]=dtos[j];
			   FoodItemDeleted=true;
		   }
		   else{
			   System.out.println("FoodItem id not found");
		   }
	   }
	   dtos=Arrays.copyOf(dtos,i);
	    return FoodItemDeleted;
   }   
   
    public boolean deleteFoodItemDetailsByName(String name){
	   System.out.println("start of deleteFoodItemDetailsByName()");
	   boolean FoodItemDeleted1=false;
	   int i,j;
	   for(i=0,j=0;j<dtos.length;j++){
		   if(!dtos[j].getName().equals(name)){
			   dtos[i++]=dtos[j];
			   FoodItemDeleted1=true;
		   }
		   else{
			   System.out.println("FoodItem name not found");
		   }
	   }
	   dtos=Arrays.copyOf(dtos,i);
	    return FoodItemDeleted1;
   } */
  
  
     


}