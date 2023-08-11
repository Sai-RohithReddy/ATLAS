package com.rohith.rd;

public class Player extends GameObject {
	private int health;
	private PlayerVehicle vehicle;
	public Player(int health, PlayerVehicle vehicle) {
		this.health = health;
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
		return health > 0;
	}
	
	public void drive() {
		System.out.printf("\nPlayer is driving [Health:%d]\n", health < 0 ? 0 : health);
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
		health -= damage - vehicle.getStrenght();
		GameManager.getInstance().addCash(cash);
	}
}
