class OrderDTO{


 private int id;
  private String name;
  private String address;
  private long contactNo;
  private String orderNO; 
  private String orderName;
  private String orderType;
  private int quatity;
  private double billAmount;
  
  ///constructor
  public OrderDTO(){
    System.out.println("OrderDTO object is created");
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
  
  public String getAddress(){
   return address;
  }
  
  public void setAddress(String address){
    this.address=address;
  }
  
  public long getContactNo(){
   return contactNo;
  }
  
  public void setContactNo(long contactNo){
    this.contactNo=contactNo;
  }
  
  public String getOrderNo(){
	  return orderNO;
  }

  public void setOrderNo(String orderNO){
	  this.orderNO=orderNO;
  }
public String getOrderName(){
	return orderName;
}
public void setOrderName(String orderName){
	this.orderName = orderName;
}
public String getOrderType(){
	return orderType;
}
public void setOrderType(String orderType){
	this.orderType = orderType;
}
public int getQuantity(){
	return quatity;
}
public void setQuantity(int quatity){
this.quatity=quatity;	
}
  public double getBillAmount(){
	  return billAmount;
  }
  
  public void setBillAmount(double billAmount){
	  this.billAmount=billAmount;
  }
  @Override
  public String toString(){
	  return "[getCustomerDetailsDto : id = "+this.getId()+",Name= "+this.getName()+",Address = "+this.getAddress()+",contactNo = "+this.getContactNo()+
	  ", orderNO ="+this.getOrderNo()+", orderName = "+this.getOrderName()+",orderType = "+this.getOrderType()+",quatity= "+this.getQuantity()+",billAmount ="+this.getBillAmount()+"]";
  }
}