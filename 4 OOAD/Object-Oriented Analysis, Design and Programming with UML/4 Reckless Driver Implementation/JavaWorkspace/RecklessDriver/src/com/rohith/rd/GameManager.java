package com.rohith.rd;

public class GameManager {
	private int cash;
	public int getCash() {
		return cash;
	}
	public void addCash(int amount) {
		cash += amount;
	}
	public void newGame() {
		//Choose vehicle
		PlayerVehicle vehicle = new PlayerVehicle("Sedan", 5, 70, 4);
		//Create a player object
		Player player = new Player(100, vehicle);
		player.setName("Player");
		//Prepare the scenery
		//Run a loop
		while (player.isAlive()) {
			//Generate gameobject (sideobject, traffic, etc)
			
			//Collide with other objects
			
			//Repeat until health = 0
		}
	}
	public void endGame() {
		System.out.printf("Total cash accumulated : %d", cash);
	}
}
