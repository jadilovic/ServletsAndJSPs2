<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter your name</title>
</head>
<body>

	<h1>Enter your name, see what happens</h1>

	<form action="${pageContext.request.contextPath}/scopes" method="get">

		<p>
			Enter your name: <br /> <input type="text" name="name">
		</p>

		<input type="submit" value="Send">

	</form>

</body>
</html>