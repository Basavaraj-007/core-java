<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

 <!DOCTYPE html>
 <html>
<body>
<div align="left"  >
         <jsp:include page="header.jsp"/>
 <h2>LOgin Success</h2>


<div class="container">
  <div class="row">
    <div class="col">
  <h4>${customers.firstName}     ${customers.bankName} bank  Balance :${customers.accountNumber}</h4>

</div>
</div>
</div>
<!-- <form action="">
<input type="submit" value="Click_here_for_SignUp"> 
</form> -->



<!-- <h3>Update Bank address by Name</h3>
<form action="updatebankaddress" method="get">
<pre>
Enter existing BankName	: <input type="text" name="bankName">
Enter address to be updated : <input type="text" name="address">
<input type="submit" value="UpdateAddress">
</pre></form>



<h3>Old Bank deleting ceremony</h3>
<form action="deletebank" method="get">
<pre>
Enter BankName to be deleted	: <input type="text" name="bankName">
<input type="submit" value="DeleteBank">
</pre></form>
 -->
</div>
</body>
</html>
</body>
</html>
