<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>War Page</title>
</head>
<body>
<h1>War Game</h1>

<nav>
<ul>
<li><a href=welcome.jsp>Home</a><br></li>
<li><a href=poker.jsp>Poker</a><br></li>
<li><a href=blackjack.jsp>Blackjack</a><br></li>
<li><a href=index.jsp>Logout</a>
</ul>
</nav>
<br>
<br>
<br>
<br>
<p>Rules of the game:</p>
<p>In this war game there will be only two players.<br>
The objective of the game is to collect all the cards in deck(52 cards in deck).<br>
Each player is given 25 cards each.<br>
Each player draws one card from the top of their deck.<br>
The player with the higher card value wins the rounds and adds both card to the bottom of their deck.<br>
If both player's card value is equal, then the player begins "WAR!"<br>
Both player deals four cards from the top of their decks and the fourth card is determines the winner for the round.<br>
If the fourth card is the same, repeat war until there's a winner.<br>
Winner of the rounds takes all the cards and placed them at the bottom of the deck.<br>
The game ends when one player has all 52 cards in their hand.
</p>
<form>
<fieldset class="account-info">
<label>
	Please enter your name: 
	<input type="text" name="name">
	</label>
	</fieldset>
<label>
	<input type="submit" name="Play" value="Play Game">
	<input type="submit" name="End" value="End Game">
</label>
</form>
</body>
</html>
