<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Welcome ${CUSTOMER.username}</h1>
<table border="1">
<tr>
<th>Select Preferred Type of Action</th>
</tr>
<tr>
<th><a href="balance">Show Balance</a></th>
</tr>
<tr>
<th><a href="../deposit.jsp">Deposit</a></th>
</tr>
<tr>
<th><a href="../withdraw.jsp">Withdraw</a></th>
</tr>
<tr>
<th><a href="../fundTransfer.jsp">Fund Transfer</a></th>
</tr>
<tr>
<th><a href="showTransaction">print Transaction Details</a></th>
</tr>
</table>
</body>
</html>