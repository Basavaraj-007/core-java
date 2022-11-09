package com.xworkz.user.dto;



	import java.util.Date;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


	@Entity
	@Table (name="user")
	@NamedQuery(name = "findByUserEmail", query = "select u from User u where u.email =:email ")
	@NamedQuery(name = "findUserById", query = "select u from User u where u.id =:id ")
	@NamedQuery(name = "deleteUserById", query = "select u from User u where u.id =:id ")


	public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name= "ID")
		private int id;
		@Column (name ="EMAIL")
		private String email;
		@Column (name = "NAME")
		private String name;
		@Column (name = "AGE")
		private int age;
		@Column (name = "PASSWORD")
		private String password;
		@Column (name = "DOB")
		private Date dateOfBirth;
		public int getId() {
			return id;
		}
		
		
		public void setId(int id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		
		
		@Override
		public String toString() {
			return "User [id=" + id + ", email=" + email + ", name=" + name + ", age=" + age + ", password=" + password
					+ ", dateOfBirth=" + dateOfBirth + "]";

		}}

