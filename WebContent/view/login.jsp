<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<h1>Login</h1>
	<p>Please enter your username and password.</p>

	<form action="${pageContext.request.contextPath}/login" method="post">

		<p>
			Username: <br />
			<input type="text" name="username" />
		</p>
		
		<p>
			Password: <br />
			<input type="password" name="password" />
		</p>

		<input type="submit" value="Login" />

	</form>
</body>
</html>