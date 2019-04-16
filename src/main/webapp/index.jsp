<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Customer's Login</h1>
	
	<form action="customers/login" method="POST"> 
		<table border="1">
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" required autofocus /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" style="float: right;" />
				</td>
			</tr>
		</table>
	</form> 
	<br>
	<a href="manager.jsp">Manager Login</a>
</body>
</html>