<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sidhant Project_23303026</title>
</head>
<body style="background-color: #DBF9FC;">
<h3 align="left">Created by Sidhant_Moza_23303026</h3>
<h3 align="center">You are at the New user Registration page</h3>
<h3 align="center">Please enter user credentials to register on my website.</h3>
	<form method="post" action="<%=request.getContextPath() %>/registration">
		<table style="background-color : #DBF9FC;" align="center">
			<tr>
				<td>New User Name</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register User" style="background-color: #FF27CA;"></td>
			</tr>
		</table>
	</form>
	<DIV ALIGN="right"><form method="get" action="Login.jsp">
	<input type="submit" value="To Login Page">
	</form>
	</DIV>

</body>
</html>