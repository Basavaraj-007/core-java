package com.xworkz.user.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xworkz.user.dto.User;
import com.xworkz.user.service.UserService;

public class UserDao {

	public static void main(String[] args) {
		User ns = new User();
		ns.setAge(25);
		ns.setEmail("ManaliYaaruilla@gmail.com");
		ns.setName("LoveRaja");
		 SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		 Date dob;
		 try {
			dob =  dateFormat.parse("1994-09-30");
			 ns.setDateOfBirth(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
		 BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
		 ns.setPassword(encoder.encode("DoorOpen24*7"));
		 
		 UserService userService =new UserService();
		// passing ns object to Service to save
		 userService.saveUser(ns);
		// User user=userService.findByUserEmail("ORG@gmail.com");
		// System.out.println("User " + user.toString());
		
		// User user=userService.findUserById(3);
			//	 System.out.println("User " + user.toString());


				// User user=userService.deleteUserById(2);
				// System.out.println("User " + user.toString());

				 
	}
}
