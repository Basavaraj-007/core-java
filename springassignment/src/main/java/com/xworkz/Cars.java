package com.xworkz;

public class Cars {

	private int cid;
	private String cName1;
	private String cName2;
	private int cModel;
	private long Cprice;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName1() {
		return cName1;
	}
	public String getcName2() {
		return cName2;
	}
	public void setcName1(String cName1) {
		this.cName1 = cName1;
	}
	public void setcName2(String cName2) {
		this.cName2 = cName2;
	}
	public int getcModel() {
		return cModel;
	}
	public void setcModel(int cModel) {
		this.cModel = cModel;
	}
	public long getCprice() {
		return Cprice;
	}
	public void setCprice(long cprice) {
		Cprice = cprice;
	}
	@Override
	public String toString() {
		return "Cars [cid=" + cid + ", cName=" + cName1 + ", cName2=" + cName2 + ", cModel=" + cModel + ", Cprice="
				+ Cprice + "]";
	}
	
	
	
}
