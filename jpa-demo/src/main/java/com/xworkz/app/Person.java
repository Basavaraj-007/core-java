package com.xworkz.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity//(is make  dto/pojo class used for JPA/Hibernate CRUD operation )
@Table(name="Person_table") //@table used to dEfine the table name and scheme name
@Data

public class Person {
	@Id //is column for the primary key of the entity note id should be integer or long type
		private int id;
		private String firstName;
		private String lastName;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		
		
		
		
	
}
