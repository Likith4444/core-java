<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Laptop</title>
<style>

body{
text-align: center;
background-color: gray;
}

</style>
</head>
<body>

<form action="${pageContext.request.contextPath}/updatee" method="post">
Id: <input type="number" name="id" value="${laptop.getId()}"><br><br>

Company Name: <input type="text" name="companyName" value="${laptop.getCompanyName()}"><br><br>
Model No: <input type="text" name="modelNo" value="${laptop.getModelNo()}"><br><br>
Color : <input type="text" name="color" value="${laptop.getColor()}"><br><br>
Processor :  <input type="text" name="processor" value="${laptop.getProcessor()}"><br><br>
Ram :  <input type="text" name="ram" value="${laptop.getRam()}"><br><br>
Email Id: <input type="text" name="emailId" value="${laptop.getEmailId()}"><br><br>

<button type="submit">Update</button>

</form>

</body>
</html>