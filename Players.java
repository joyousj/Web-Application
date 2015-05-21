package com.dto;
//Java bean class for blackjack game

public class Player {

	private String name;
	private int rounds;
	
	public static boolean playerInfo(String name, int rounds) {
		//boolean status = false;
		return playerInfo();
	}
	
	private static boolean playerInfo() {
		// TODO Auto-generated method stub
		return true;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
}
