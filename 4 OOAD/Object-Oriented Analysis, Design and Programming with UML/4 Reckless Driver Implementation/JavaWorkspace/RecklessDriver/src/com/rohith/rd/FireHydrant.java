package com.rohith.rd;

public class FireHydrant extends SideObject {

	public FireHydrant(int damage, int cash) {
		super(damage, cash);
	}
	
	@Override
	public void onCollision(GameObject other) {
		super.onCollision(other);
	}

}
