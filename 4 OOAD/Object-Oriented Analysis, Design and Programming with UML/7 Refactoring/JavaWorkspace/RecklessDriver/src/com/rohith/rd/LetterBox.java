package com.rohith.rd;

public class LetterBox extends SideObject {

	public LetterBox(int damage, int cash) {
		super(damage, cash);
		setName("LetterBox");
	}

	@Override
	public void onCollision(GameObject other) {
		if (other.getTag().equals("Player")) {
			Player player = (Player) other;
			if (count == 0) {
				System.out.println("#### COLLISION -> [LetterBox] Letters falling");
				player.applyDamage(getDamage(), getCash());
			} else {
				System.out.println("#### COLLISION -> [LetterBox] Collided again");
				player.applyDamage(getDamage(), getCash() * count);
			}
		}
	}

}
