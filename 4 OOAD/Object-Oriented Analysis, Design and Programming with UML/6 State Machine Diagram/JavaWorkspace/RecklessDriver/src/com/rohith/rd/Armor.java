package com.rohith.rd;

public class Armor extends PowerUp {

	@Override
	public void applyPoserUp(Player player, int damage, int cash) {
		int totalDamage = player.getPlayerVehicle().getStrenght() + damage / 2;
		player.getPlayerHealth().setUnits(player.getPlayerHealth().getUnits() - totalDamage);
		GameManager.instance.addCash(cash);
		if (--countdown == 0) {
			player.setPowerUp(new NoPowerUP());
		}
	}

	@Override
	public void onCollision(GameObject other) {
		if (other.getTag() == "Player") {
			System.out.println("*******************************");
			System.out.println("************ ARMOR ************");
			System.out.println("*******************************");
			Player p = (Player) other;
			p.setPowerUp(this);
		}
	}

	@Override
	public String toString() {
		return "ARMOR:" + countdown;
	}
}
