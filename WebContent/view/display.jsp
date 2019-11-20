<%@page import="model.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Person</title>
</head>
<body>

	<h1>Information</h1>

	<%
		Person person = (Person) request.getAttribute("person");
	%>

	<p>
		Name:
		<%=person.getName()%>
	</p>
	<p>
		Gender:
		<%=person.getGender()%>
	</p>
	<p>
		Enjoy:
		<% for (String s: person.getEnjoy()) {
			out.print(s + ",");
		}
		%>
	</p>
	
	
</body>
</html>