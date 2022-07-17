class FoodItemDto{

   private int id;
   private String name;
   private double price;
   private boolean isAvailable;
   private String itemdetails;
   private String type;

  public FoodItemDto(){
    System.out.println("FoodItemDto object is created");
  }
  
  public int getId(){
   return id;
  }
  
  public void setId(int id){
    this.id=id;
  }
  
  public String getName(){
   return name;
  }
  
  public void setName(String name){
    this.name=name;
  }
  
  public double getPrice(){
   return price;
  }
  
  public void setPrice(double price){
    this.price=price;
  }
  
    public boolean getIsAvailable(){
   return isAvailable;
  }
  
  public void setIsAvailable(boolean isAvailable){
    this.isAvailable=isAvailable;
  }
  
  public String getItemdetails(){
   return itemdetails;
  }
  
  public void setItemdetails(String itemdetails){
    this.itemdetails=itemdetails;
  }
  public String getType(){
	  return type;
  }
  public void setType(String type){
	  this.type = type;
  }
  @Override
  public String toString(){
	  return "[FoodItemDto : Id = "+this.getId()+", Name = "+this.getName()+", Price = "+this.getPrice()+
	  ",isAvailable ="+this.getIsAvailable()+",ItemDeatails = "+this.getItemdetails()+",type = "+this.getType()+"]";
  }
}