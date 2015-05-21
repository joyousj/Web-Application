<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Welcome Page</title>
</head>
<body>
<h1>Welcome Back!</h1>


<br><br>
<nav>
<ul>
<li><a href=poker.jsp>Poker</a><br></li>
<li><a href=blackjack.jsp>Blackjack</a><br></li>
<li><a href=war.jsp>War</a><br></li>
<li><a href=index.jsp>Logout</a>
</ul>
</nav>

<br><br>
<br><br>

<p>Hello,<%=session.getAttribute("userid") %>!</p>

<p>You've sucessfully logged in! Ready to play today?! </p>

<%-- <jsp:useBean id="user" class="com.dto.User" scope="request"></jsp:useBean> --%>


<%-- <p>Hello <jsp:getProperty property="userid" name="user"/></p> --%>


</body>
</html>
