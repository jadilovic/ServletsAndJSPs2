<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.User"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Successful</title>
</head>
<body>

	<%
		User user = (User) session.getAttribute("user");
	%>

	<h1>Login successful</h1>

	<p>
		Username:
		<%=user.getUsername()%>
	</p>
	<p>
		Password:
		<%=user.getPassword()%>
	</p>

</body>
</html>