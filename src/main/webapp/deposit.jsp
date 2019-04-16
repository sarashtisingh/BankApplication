<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit</title>
</head>
<body>
<h1> Deposit Money</h1>
<form action="customers/deposit">
<table border="1">
<tr>
<th>Enter the amount</th>
<td><input type="number" name="deposit" required></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Add Money" style="float:right;"></td></tr>
</table>
</form>
<a href ="../home.jsp">Home</a>
</body>
</html>