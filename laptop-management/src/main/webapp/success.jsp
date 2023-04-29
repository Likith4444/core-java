<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to our application</h1>
<br>
<br>
<a href="listOfLaptops">List Of Laptops</a>
<table>
<tr>
<th>Company Name</th>
<th>Model Number</th>
<th>Color</th>
<th>Processor</th>
<th>Ram</th>
</tr>

<ref:forEach items="${laptops}" var="laptop">
<tr>
<td>${ laptop.getCompanyName() }</td>
<td>${ laptop.getModelNo() }</td>
<td>${ laptop.getColor() }</td>
<td>${ laptop.getProcessor() }</td>
<td>${ laptop.getRam() }</td>
</tr>
</ref:forEach>
</table>
</body>
</html>