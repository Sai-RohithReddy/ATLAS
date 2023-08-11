package com.rohith.rd;

public class Sedan extends TrafficCar {
	public Sedan(int damage, int cash) {
		super(damage, cash);
	}

	@Override
	public void onCollision(GameObject other) {
		super.onCollision(other);
	}
}
