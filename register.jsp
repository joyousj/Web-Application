<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<title>Registration Page</title>
</head>
<body>
<h1>Registration</h1>

<form action="RegisterServlet" method="POST">
<fieldset class="account-info">
<label>
	First Name
	<input type="text" name="fname">
	Last Name
	<input type="text" name="lname">
</label>
<label>
	Username
	<input type="text" name="userid">
	Password
	<input type="password" name="password">
</label>
<label>
	Email
	<input type="text" name="email">
</label>
</fieldset>
<fieldset class="account-action">
	<input class="btn" type="submit" name="action" value="Submit">
</fieldset>
</form>
 
</body>
</html>
