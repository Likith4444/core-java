<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<HTML>
<HEAD>
<meta charset="ISO-8859-1">
<title>Patient's Data</title>
<style>
body{
text-align: center;
background-image: url("https://handsurgeons.ph/wp-content/uploads/2020/08/manila_doctors_hospital.png");
}
</style>
</HEAD>
<body>

<form action="registerPatients" method="post">

Patient Name: <input type="text" name="patientName"><br><br>
Room No: <input type="text" name="roomNo"><br><br>
Patient Address: <input type="text" name="patientAddress"><br><br>
Gender: <input type="text" name="gender"><br><br>
Age: <input type="text" name="age"><br><br>

<input type="submit" value="submit">

</form>
</body>
</HTML>
