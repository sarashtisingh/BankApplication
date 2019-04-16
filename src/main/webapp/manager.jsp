<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Login</title>
</head>
<body>
<h1>Manager's Login</h1>
	<form action="../manager/login" method="POST"> 
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
	<a href="index.jsp">Home</a>
</body>
</html>