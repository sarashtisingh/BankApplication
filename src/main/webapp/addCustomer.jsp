<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
<h1>Add Customer's Details</h1>
<form action="../customers/add" method="post">
<table>
<tr>
<td> Customer's Name</td>
<td><input type = "text" name="name" required autofocus /> </td>
</tr>

<tr>
<td> Customer's Username</td>
<td><input type = "text" name="username" required/> </td>
</tr>

<tr>
<td> Customer's Password</td>
<td><input type = "text" name="password" required min=8/> </td>
</tr>

<tr></tr>
<tr>
<td><input type = "submit" value = "Add Customer Account" /></td>
</tr>
</table>
</form>
<a href="index.jsp">Home</a>
</body>
</html>