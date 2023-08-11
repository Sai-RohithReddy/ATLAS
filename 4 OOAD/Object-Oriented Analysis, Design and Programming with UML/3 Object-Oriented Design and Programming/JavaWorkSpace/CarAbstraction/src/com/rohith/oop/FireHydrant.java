package com.rohith.oop;

public class FireHydrant extends SideObject {
	
	public FireHydrant() {
		super();
	}

	public FireHydrant(int damage, String name) {
		super(damage, name);
	}

	public void onCollision(GameObject other) {
		System.out.println("Collided with firehydrant");
	}
}
