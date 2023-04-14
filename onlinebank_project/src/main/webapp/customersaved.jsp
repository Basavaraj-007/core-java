<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1" isELIgnored="false"%>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <jsp:include page="header.jsp"/>
</head>
<body>

<div class="container">
  <div class="row">
    <div class="col">
  <h4>${cust.firstName} registered for ${cust.bankName} bank</h4>

    </div>
    <div class="col">
    Registered AccountNo is : ${cust.accountNumber}<br>
Customer Id for registered bank is : ${cust.customerId}
    </div>
  </div>
  </div>





</body>
</html>