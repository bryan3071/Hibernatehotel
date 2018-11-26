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
<header >
<p> Hello </p>

<p> Here are the hotels and prices for the city selected</p>
 
<form action="/">
<table>
<thead>
			<tr>
				<th>Hotel Id</th>
				<th>City</th>
				<th>Name</th>
				<th>Price Per Night</th>
			</tr>
		</thead>
<c:if test="${ not empty list }">
					<thead>
						<tr>
							<th>Name</th>
							<th>Price</th>
						</tr>
					</thead>
					<c:forEach var="hotel" items="${ results }">
						<tr>
							<td>${ hotel.name }</td>
							<td>$ ${ hotel.price }</td>
						</tr>
					</c:forEach>
					</c:if>
					
				</table>
				 </form>
				</header>

</body>
</html>