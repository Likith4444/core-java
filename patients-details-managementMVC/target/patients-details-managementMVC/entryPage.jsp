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

<h1>Welcome To Patients Details Page</h1>
<h2>Entry page of Application...</h2>
<br><br>
<a href="listOfPatients">Click Here For ---> Patients Details List</a>
<br><br>

<form action="searchByPatientName" method="get">
<input type="text" name="patientName" placeholder="Enter The Patient Name">
<button>Search</button>
</form>
<br><br>

<table border="4">
<tr>
<th>Id</th>
<th>Patient Name</th>
<th>Room Number</th>
<th>Address</th>
<th>Gender</th>
<th>Age</th>
<th>ACTION-1</th>
<th>ACTION-2</th>
</tr>

<ref:forEach items="${patients}" var="patient">
<tr>
<td>${ patient.getId() }</td>
<td>${ patient.getCompanyName() }</td>
<td>${ patient.getModelNo() }</td>
<td>${ patient.getColor() }</td>
<td>${ patient.getProcessor() }</td>
<td>${ patient.getRam() }</td>
<td><a href="update/${patient.getId()}">Update</a></td>
<td><a href="delete/${patient.getId()}">Delete</a></td>
</tr>
</ref:forEach>
</table>

</body>
</html>