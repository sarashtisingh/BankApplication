<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Details</title>
</head>
<body>
	<h1>Transaction Details</h1>
	<table border="1">
		<tr>
			<th>Transaction ID</th>
			<th>Amount</th>
			<th>Transaction Type</th>
		</tr>
		<c:forEach var="transaction" items="${TRANSACTIONSLIST}">
			<tr>
				<td>${transaction.transactionId}</td>
				<td>${transaction.amount}</td>
				<td>${transaction.type}</td>
			</tr>
		</c:forEach>
	</table>
<a href ="../home.jsp">Home</a>
</body>
</html>