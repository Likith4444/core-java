<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<style>

body{
text-align: center;
background-image: url("https://wallpapercave.com/wp/wp8003033.jpg");
}

</style>
</head>
<body>

<form action="${pageContext.request.contextPath}/updatee" method="post">

Id: <input type="number" name="id" value="${patient.getId()}"><br><br>
Patient Name: <input type="text" name="patientName"><br><br>
Room No: <input type="text" name="roomNo"><br><br>
Patient Address: <input type="text" name="patientAddress"><br><br>
Gender: <input type="text" name="gender"><br><br>
Age: <input type="text" name="age"><br><br>

<button type="submit">Update</button>

</form>

</body>
</html>