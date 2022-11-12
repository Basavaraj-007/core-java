<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<body>

<h2>Bank Information!</h2>

<form action="banksave" method="post">
<pre>
bankName:<input type="text" name="bankName">
branchName:<input type="text" name="branchName">
ifscCode:<input type="text" name="ifsccode">
address:<input type="text" name="address">

<input type="submit" value="save">

</pre>
</form>
<h2>${bankName }</h2>



</body>
</html>
