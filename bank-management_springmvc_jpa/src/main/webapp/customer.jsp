<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
</head>
<body>
<h2> Customer Information </h2>

<form action="customersave" method="post" >
<pre>
FirstName 	 : <input type="text" name="firstname">
LastName  	 : <input type="text" name="lastname">
Address   	 : <input type="text" name="address">
EmailID   	 : <input type="text" name="emailid">
UserName  	 : <input type="text" name="username">
Password     : <input type="text" name="password">
MobileNumber : <input type="text" name="mobilenumber">
Gender	 	 : <input type="radio" name="gender" value="Male">
			 : <input type="radio" name="gender" value="Female">
			 
GovtID 		 : <input type="text" name="govt_id">
AccountNumber: <input type="text" name="accountNumber">
CustomerID 	 : <input type="text" name="customerID">
Balance 	 : <input type="radio" name="balance" value="500">			 
			 : <input type="radio" name="balance" value="1000">
			 
<input type="submit" value="save">


<!-- 
private String govt_id;
	@Column(unique = true)
	private String accountNumber;
	@Column(unique = true)
	private String customerID;
	private Double balance;
 -->
<!-- 
	private String firstname;
	private String lastname;
	private String address;
	@Column(unique = true)
	private String emailid;
	private String username;
	private String password;
	private String mobilenumber;
	private String gender;
 -->
</pre>
</form>
<h2>${govt_id }</h2>
</body>
</html>