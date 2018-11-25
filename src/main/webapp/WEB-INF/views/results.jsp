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
<header class="w3-display-container w3-content" style="max-width:1500px;">
<p> Hello </p>

<p> Here are the hotels and prices for the city selected</p>
 <h2><i class="fa fa-bed w3-margin-right"></i>Hotels<c:if test="${ not empty city }"> in ${ city }</c:if></h2><h6><i>(under $${ max })</i></h6>
<form action="/">
<table class="table table-striped table-dark">
<c:if test="${ not empty list }">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Name</th>
							<th scope="col">Price</th>
						</tr>
					</thead>
					<c:forEach var="hotel" items="${ list }">
						<tr>
							<td>${ hotel.name }</td>
							<td>$ ${ hotel.price }</td>
						</tr>
					</c:forEach>
					</c:if>
					<c:if test="${ empty list }">
						<h4>Your search parameters didn't turn up any results!</h4>
					</c:if>
				</table>
				 </form>
				</header>

</body>
</html>