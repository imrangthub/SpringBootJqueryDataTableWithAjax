<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<!-- Static content -->
<link rel="stylesheet" href="/resources/stylesheets/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/stylesheets/application.css">
 
<title>Java Sample Approach Demo</title>
</head>
<body>
 
	<form:form method="POST" modelAttribute="requestInfo">
		<table>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Text:</td>
				<td><form:input path="text" /></td>
				<td><form:errors path="text" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
	
	
	<script type="text/javascript" src="/resources/javascripts/vendor/jquery/jquery-2.2.0.min.js"></script>
<script type="text/javascript" src="/resources/javascripts/vendor/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/javascripts/application.js"></script>
 
</body>
</html>