<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Poker Game</title>
</head>
<body>
<h1>Poker Game</h1>
<nav>
<ul>
<li><a href=welcome.jsp>Home</a><br></li>
<li><a href=blackjack.jsp>Blackjack</a><br></li>
<li><a href=war.jsp>War</a><br></li>
<li><a href=index.jsp>Logout</a>
</ul>
</nav>
<br><br>
<br><br>
<p>Rules of the game:</p>
<p> Five card draw is one of the most common types of poker hands. <br> 
Each player is dealt five cards, then a round of betting follows. <br>
Then each player may discard up to 3 cards (4 if your last card is an ace or wild card, in some circles) and get back (from the deck) as many cards as he/she discarded.<br> 
Then there is another round of betting, and then hands are revealed (the showdown) and the highest hand wins the pot.<br>
So you are the dealer at a five card draw game (against four other players, Alex, Brad, Charley and Dennis (seated in that order to your left).<br> 
Everyone puts a nickel into the pot (Ante) and you deal out 5 cards to each player</p>
<br>
<br>
<br><br>
<form class="poker" action="PokerServlet" method="POST">
<fieldset class="player-info">
<label>
	What's your name? 
	<input type="text" name="name">
</label>
<label>
	How many players? 
	<input type="text" name="players">
</label>
</fieldset>
<fieldset class="money-info">
<label>
	Ante in $ 
	<input type="text" name="ante">
</label>
<label>
	Wallet in $ 
	<input type="text" name="wallet"><br><br>
</label>
</fieldset>
<fieldset>
<label>
	<input type="submit" name="Play" value="Play Game">
	<input type="submit" name="End" value="End Game">
</label>
	</fieldset>
</form>

</body>
</html>
