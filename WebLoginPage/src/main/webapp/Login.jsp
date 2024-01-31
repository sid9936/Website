<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sidhant Java Project</title>
</head>
<body style="background-color: #DBF9FC;">
<h3 align="left">Created by Sidhant_Moza_23303026</h3>
<h3 align="center">You are at the Existing user Login page</h3>
<h3 align="center">Please enter valid Login credentials to proceed further</h3>
	<form method="post" action="loginsuccess.jsp">
		<table style="background-color : #DBF9FC;" align="center">
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" style="background-color: #FF27CA;"></td>
			</tr>
		</table>
	</form>
	<DIV ALIGN="right"><form method="get" action="registration.jsp">
	<input type="submit" value="New registration">
	</form>
	</DIV>

</body>
</html>