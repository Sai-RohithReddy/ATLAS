package com.rohith.rd;

public class Player extends GameObject {
	private PlayerHealth playerHealth = new PlayerHealth();
	private PlayerVehicle vehicle;
	private PowerUp powerUp = PowerUpFactory.createPoserUp(-1);

	public Player(int health, PlayerVehicle vehicle) {
		playerHealth.setUnits(health);
		this.vehicle = vehicle;
	}

	public void accelerate() {
		vehicle.up();
	}

	public void brake() {
		vehicle.down();
	}

	public void steerLeft() {
		vehicle.left();
	}

	public void steerRight() {
		vehicle.right();
	}

	public boolean isAlive() {
		return playerHealth.getPlayerState() != PlayerState.DEAD;
	}

	public void drive() {
		System.out.printf("\nPlayer is driving [Health:%d][%s]\n", playerHealth.getUnits(), powerUp);
		for (int i = 0; i < 10; ++i) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println("");
	}

	public void applyDamage(int damage, int cash) {
		powerUp.applyPoserUp(this, damage, cash);

	}

	public PlayerHealth getPlayerHealth() {
		return playerHealth;
	}

	public PlayerVehicle getPlayerVehicle() {
		return vehicle;
	}

	public void setPowerUp(PowerUp p) {
		powerUp = p;
	}

	public PowerUp getPowerUp() {
		return powerUp;
	}

}
