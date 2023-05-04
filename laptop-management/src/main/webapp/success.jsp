<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ref"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<style type="text/css">
table{

background-color:aqua; ;
text-align: center;

}
</style>
</head>
<body>
<h1>Welcome to our application</h1>
<br>
<br>
<a href="listOfLaptops">List Of Laptops</a>


<form action="searchByCompanyName" method="get">
<input type="text" name="companyName" placeholder="Enter The Company Name">
<button>Search</button>
</form>
<br><br>


<table border="3">
<tr>
<th>Company Name</th>
<th>Model Number</th>
<th>Color</th>
<th>Processor</th>
<th>Ram</th>
<th>EmailId</th>
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