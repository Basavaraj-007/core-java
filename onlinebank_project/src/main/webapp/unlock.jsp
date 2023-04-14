<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<form action="unlockcutomer" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
 
  <button type="unlock" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
</div>
 <h4> ${cutomerunlocked} </h4>
 
</body>
</html>