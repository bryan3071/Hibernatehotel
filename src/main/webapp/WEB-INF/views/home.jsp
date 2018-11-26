<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p> Hello </p>

<p> Please select a city from the menu and we will show you the details from one of our excellent hotels</p>

<form action ="/results" method:"post">
		Hotel City: <select name="city">
  <c:forEach var = "city" items="${cities }">
  <option value="${city }">${city }</option>
  
  </c:forEach>
  
  
</select>

<button>Submit</button>
	</form>
	
	

</body>
</html>