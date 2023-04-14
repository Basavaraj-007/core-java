<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

 <!DOCTYPE html>
 <html>
<body>
<div align="left"  >
         <jsp:include page="header.jsp"/>


<div class="container">
  <div class="row">
    <div class="col">
<form action="logincustomer" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="mailId" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password">
  </div>
 
  <button type="submit" class="btn btn-primary">Login</button>
</form>
</div>
</div>
</div>
<!-- <form action="">
<input type="submit" value="Click_here_for_SignUp"> 
</form> -->




</div>
</body>
</html>
</body>
</html>
