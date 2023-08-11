package com.rohith.rd;

public class PlayerVehicle {
	private String name;
	private int handling;
	private int topSpeed;
	private int strenght;
	public PlayerVehicle(String name, int handling, int topSpeed, int strenght) {
		this.name = name;
		this.handling = handling;
		this.topSpeed = topSpeed;
		this.strenght = strenght;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHandling() {
		return handling;
	}
	public void setHandling(int handling) {
		this.handling = handling;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getStrenght() {
		return strenght;
	}
	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}
	
	public void up() {
		
	}
	
	public void down() {
		
	}
	
	public void left() {
		
	}
	
	public void right() {
		
	}
}
