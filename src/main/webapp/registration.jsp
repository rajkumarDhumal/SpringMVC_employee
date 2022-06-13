<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="save" modelAttribute="employee">
	<form:label path="name">Name:</form:label>
	<form:input path="name"/>
	
	<form:label path="department">Department:</form:label>
	<form:input path="department"/>
	
	<form:label path="pno">Phone no:</form:label>
	<form:input path="pno"/>
	
	<input type="submit">
	
</form:form>
</body>
</html>