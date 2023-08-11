package com.rohith.rd;

public class GameManager {
	private int cash;
	private GameManager() {
	}
	static GameManager instance = new GameManager();
	public static GameManager getInstance() {
		return instance;
	}
	public int getCash() {
		return cash;
	}

	public void addCash(int amount) {
		cash += amount;
	}

	public void newGame() {
		// Choose vehicle
		PlayerVehicle vehicle = new PlayerVehicle("Sedan", 5, 70, 4);
		// Create a player object
		Player player = new Player(100, vehicle);
		player.setTag("Player");
		// Prepare the scenery
		Scene scene = new Scene();
		scene.start(player);
		// Run a loop
		while (player.isAlive()) {
			// Generate gameobject (sideobject, traffic, etc)
			scene.execute();
			// Player is driving the car
			player.drive();
			// Collide with other objects
			scene.collide();
			// Repeat until health > 0
		}
		endGame();
	}

	public void endGame() {
		System.out.printf("Total cash accumulated : %d", cash);
	}
}
