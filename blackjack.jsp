<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>

<title>Blackjack Game</title>
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
<br>
<br>
<p>Rules of the game:</p>
<p>The goal of Blackjack is to beat the dealer's hand without going over 21.<br>
Each players are dealt two cards.<br>
The player is given the choice to either "Hit" or "Stay".<br>
If the player choses to "Hit", a card is dealt to the player.<br>
If the player decides to "Stay", a card will not be added to the hand.<br>
The dealer will always "Hit" if the card value is 17. 
</p>
<form method="POST" action="BlackjackServlet">
<div class="player-info">
<label>
	What's your name?
	<input type="text" name="name">
</label>
<label>
	How many rounds?
	<input type="text" name="rounds">
</label>
</div>
<label>
	<input type="submit" name="Play" value="Play Game">
	<input type="submit" name="End" value="End Game">
</label>
</form>


</body>
</html>
