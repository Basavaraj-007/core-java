<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
   <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
       <script src="<c:url value="/resources/js/jquery-3.2.1.slim.min.js" />"></script> 
    <script src="<c:url value="/resources/js/popper.min.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script> 
 

<%-- <c:set var="myContext" value="${pageContext.request.contextPath}"/>
   <link href="<c:url value="${myContext}/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script src="<c:url value="${myContext}/resources/js/bootstrap.min.js" />"></script> 
    <link rel="stylesheet" href="${myContext}/resources/css/bootstrap.min.css">
        <script type="text/javascript" value="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    --%>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">Online Bank</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="home">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="new">Register</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="loginpage">Sign In</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="addBank">Add Bank</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="unlock">Unlock customer</a>
      </li>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="logout">Logout</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
      </li>
    </ul>
   
     <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form> 
  </div>
</nav>
</body>
</html>