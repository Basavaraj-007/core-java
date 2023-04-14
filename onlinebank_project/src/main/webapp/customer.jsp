<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <jsp:include page="header.jsp"/>
<div class="container">
  <div class="row">
    <div class="col">
    <h2>New Customer Registration</h2>
   <form action="customersave" method="post" >
  <div class="form-group">
    <label >FirstName</label>
    <input type="text" class="form-control" name="firstName" placeholder="firstName">
  </div>
    <div class="form-group">
    <label>LastName</label>
    <input type="text" class="form-control" name="lastName" placeholder="lastName">
  </div>
  
   <div class="form-group">
    <label>Address</label>
    <input type="text" class="form-control" name="address" placeholder="address">
  </div> 
  <div class="form-group">
    <label>UserName</label>
    <input type="text" class="form-control" name="userName" placeholder="userName">
  </div> 
   <div class="form-group">
    <label>EMailId</label>
    <input type="text" class="form-control" name="mailId" placeholder="mailId">
  </div> 
    <div class="form-group">
    <label>Password</label>
    <input type="password" class="form-control" name="password" placeholder="password">
  </div> 
   <div class="form-group">
    <label>MobileNo</label>
    <input type="text" class="form-control" name="mobileNo" placeholder="mobileNo">
  </div> 
  

<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="Male">
  <label class="form-check-label" for="inlineRadio1">Male</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="Female">
  <label class="form-check-label" for="inlineRadio2">Female</label>
</div>
  <div class="form-group">
    <label>Bank Name :</label>
    <input type="text" class="form-control" name="bankName" value="Sbi" placeholder="bankName" readonly>
  </div> 
  <div class="form-group">
    <label for="exampleFormControlSelect1">Type of Account :</label>
    <select class="form-control" id="exampleFormControlSelect1" name="typeOfAccount">
      <option>Saving</option>
      <option>Current</option>
      <option>RD</option>
      <option>Fixed Desposit</option>
    </select>
  </div>
  
    <div class="form-group">
    <label>GovtId :</label>
    <input type="text" class="form-control" name="govtId" placeholder="govtId">
  </div> 
  
   <div class="form-group">
    <label for="initialDepositSelect1">Initial Deposit</label>
    <select class="form-control" id="initialDepositSelect1" name="initialDeposit">
      <option>500</option>
      <option>1000</option>
      <option>2000</option>
     
    </select>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form> 
    
  <!--   -----------------------
<form action="customersave" method="post">
<pre>
FirstName : <input type="text" name="firstName">
LastName : <input type="text" name="lastName" >
Address : <input type="text" name="address">
UserName : <input type="text" name="userName">
MailId : <input type="text" name="mailId">
Password : <input type="text" name="password">
MobileNo : <input type="text" name="mobileNo">
Gender : <input type="radio" name="gender" value="Male">
<input type="radio" name="gender" value="Female">
Bank Name :<input type="text" name="bankName">
Type of Account :<input type="checkbox">
GovtId	: <input type="text" name="govtId">
Initial Deposit		: <input type="radio" name="initialDeposit" value="500">
<input type="radio" name="initialDeposit" value="1000">

<input type="submit" value="CreateCustomer">
</pre></form> -->
    </div>
    <div class="col">
      2 of 2
    </div>
  </div>
  </div>
 <div>
<h2>Here is your searched Bank details</h2><br>

${banks.id}
${banks.bankName}
${banks.branchName}
${banks.ifscCode}
${banks.address}

</div>




<h3>Search Customer by Name</h3>
<form action="findcustomer" method="get">
<pre>
CustomerName	: <input type="text" name="firstName">
<input type="submit" value="SearchCustomer">
</pre></form>

<h3>Update Customer address by Name</h3>
<form action="updatecustomeraddress" method="get">
<pre>
Enter existing CustomerName	: <input type="text" name="firstName">
Enter address to be updated : <input type="text" name="address">
<input type="submit" value="UpdateAddress">
</pre></form>

<h3>Delete Existing Customer</h3>
<form action="deletecustomer" method="get">
<pre>
Enter Customer Name to be deleted	: <input type="text" name="firstName">
<input type="submit" value="DeleteCustomer">
</pre></form>

</body>
</html>