<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fund Transfer</title>
</head>
<body>
<h1>Transfer Fund</h1>
	<form action=customers/fundTransfer>
		<table border="1">
			<tr>
				<td>Enter the Account Number</td>
				<td><input type="number" name="id"></td>
			</tr>
			<tr>
				<td>Enter the Amount</td>
				<td><input type="number" name="credit"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Transfer"></td>
			</tr>
		</table>
	</form>
	<a href="../home.jsp">Home</a>
</body>
</html>