<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Done</title>
</head>
<body>
<h1> Fund transferred Successfully</h1>
<table border="1">
<tr>
<th>Account holder's Name</th>
<th>Balance</th>
</tr>
<tr>
<td>${SENDER.name}</td>
<td>${SENDER.balance}</td>
</tr>
<%-- <tr>
<td>${RECIVER.name}</td>
<td>${RECIVER.balance}</td>
</tr> --%>
</table>
</body>
</html>