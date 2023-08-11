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
	
	public void applyDamage(int damage, int cash) {
		health -= damage - vehicle.getStrenght();
	}
}
