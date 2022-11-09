package com.xworkz.customer.dto;

public class OrderDTO {

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getOrderNO() {
		return orderNO;
	}

	public void setOrderNO(String orderNO) {
		this.orderNO = orderNO;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", name=" + name + ", address=" + address + ", contactNo=" + contactNo
				+ ", orderNO=" + orderNO + ", orderName=" + orderName + ", orderType=" + orderType + ", quatity="
				+ quatity + ", billAmount=" + billAmount + "]";
	}
	  
	  
}
