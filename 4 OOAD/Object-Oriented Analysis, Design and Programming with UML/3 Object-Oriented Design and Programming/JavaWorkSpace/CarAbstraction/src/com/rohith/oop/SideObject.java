package com.rohith.oop;

public class SideObject extends GameObject{
	private int damage;

	public SideObject(int damage, String name) {
		super(name);
		this.damage = damage;
	}

	public SideObject() {
		
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}
