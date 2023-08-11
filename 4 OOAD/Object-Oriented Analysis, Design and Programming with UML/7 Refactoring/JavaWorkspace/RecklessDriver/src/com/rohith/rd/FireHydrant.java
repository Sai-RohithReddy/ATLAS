package com.rohith.rd;

public class FireHydrant extends SideObject {

	public FireHydrant(int damage, int cash) {
		super(damage, cash);
		setName("FireHydrant");
	}

	@Override
	public void onCollision(GameObject other) {
		if (other.getTag().equals("Player")) {
			Player player = (Player) other;
			if (count == 0) {
				System.out.println("#### COLLISION -> [FireHydrant] Fountain");
				player.applyDamage(getDamage(), getCash());
			} else {
				System.out.println("#### COLLISION -> [FireHydrant] Collided again");
				player.applyDamage(getDamage(), getCash() * count);
			}
		}
	}

}
