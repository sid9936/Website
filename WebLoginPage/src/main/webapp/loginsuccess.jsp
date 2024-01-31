<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="net.login.setup.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="id" class="net.login.model.UserBase" />

	<jsp:setProperty property="*" name="id" />

	<%
	DaoSetup loginDao = new DaoSetup();
	boolean status = loginDao.validate(id);
	if (status) {
		out.print("<h1>Welcome. You have logged in successfully !</h1>");
		response.sendRedirect("Member.jsp");
	}else{
		out.print("<h4>Incorrect credentials. Retry login.</h4>");
		response.sendRedirect("Error.jsp");
	}
	%>

</body>
</html>
