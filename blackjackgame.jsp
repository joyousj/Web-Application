<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Blackjack</title>
</head>
<body>
<h1>Blackjack Game</h1>
<nav>
<ul>
<li><a href=welcome.jsp>Home</a><br></li>
<li><a href=poker.jsp>Poker</a><br></li>
<li><a href=war.jsp>War</a><br></li>
<li><a href=index.jsp>Logout</a>
</ul>
</nav>
<br>
<br>
<p>Hello, <%=session.getAttribute("name")%>!</p><br>
<p>Playing <%=session.getAttribute("rounds")%> rounds! Let's begin!</p>

</body>
</html>
