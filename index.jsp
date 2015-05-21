<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>

<title>Joy's Game Center</title>
</head>
<body>
<li><a href=register.jsp>Register</a></li>
<br>
<br>
<h1>Joy's Game Center</h1>


<form method="POST" action="IndexServlet">
<fieldset class="account-info">
<label>
	Username
	<input type="text" name="userid" >
</label>
<label>
	Password
	<input type="password" name="password">
</label>
</fieldset>

<fieldset class="account-action">
	<input class="btn" type="submit" name="login" value="Login">
<label>
	<input type="checkbox" name="remember"> Stay signed in 

</label>
</fieldset>
</form>
<br>
<footer>Please Sign-in.. or register if new user! </footer><br>

<br>
<br>
<br>
<br>
<br>
<br>
<footer>
Created by Joy Singharath
</footer>

</body>
</html>
