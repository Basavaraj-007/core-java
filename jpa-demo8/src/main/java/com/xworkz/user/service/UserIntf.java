package com.xworkz.user.service;


	import com.xworkz.user.dto.User;

	public interface UserIntf {

		public void saveUser (User user);
		
		
		public User findUserById (int userId);
		
		public User deleteUserById (int userId);
		
		public User loginUser (String email,  String password);

		public User updateUser (User user);

}
