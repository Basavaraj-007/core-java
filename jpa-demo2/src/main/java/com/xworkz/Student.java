package com.xworkz;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//(is make  dto/pojo class used for JPA/Hibernate CRUD operation )
@Table(name="Student_table") //@table used to dEfine the table name and scheme name

public class Student {
	@Id
	private int id ;
	private String studentName;
	private int studentAge;
	private String studentSection;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentAge=" + studentAge + ", studentSection="
				+ studentSection + ", marks=" + marks + "]";
	}
	
	
	
}
