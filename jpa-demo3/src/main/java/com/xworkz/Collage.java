package com.xworkz;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//(is make  dto/pojo class used for JPA/Hibernate CRUD operation )
@Table(name="Collage_table") //@table used to dEfine the table name and scheme name
public class Collage {

	@Id
	private int id ;
	private String collageName;
	private int yearOfEstablished;
	private String collageAddress;
	private long collageContactNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public int getYearOfEstablished() {
		return yearOfEstablished;
	}
	public void setYearOfEstablished(int yearOfEstablished) {
		this.yearOfEstablished = yearOfEstablished;
	}
	public String getCollageAddress() {
		return collageAddress;
	}
	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}
	public long getCollageContactNo() {
		return collageContactNo;
	}
	public void setCollageContactNo(long collageContactNo) {
		this.collageContactNo = collageContactNo;
	}
	@Override
	public String toString() {
		return "Collage [id=" + id + ", collageName=" + collageName + ", yearOfEstablished=" + yearOfEstablished
				+ ", collageAddress=" + collageAddress + ", collageContactNo=" + collageContactNo + "]";
	}
	
	
}
