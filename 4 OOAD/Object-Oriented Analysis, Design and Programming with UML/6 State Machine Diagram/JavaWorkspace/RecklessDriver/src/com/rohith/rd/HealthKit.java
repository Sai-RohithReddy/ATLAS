package com.rohith.rd;

public class HealthKit extends PowerUp {
	private static final int INCRESE_HEALTH = 25;
	@Override
	public void applyPoserUp(Player player, int damage, int cash) {
		
	}

	@Override
	public void onCollision(GameObject other) {
		if(other.getTag().equalsIgnoreCase("Player")) {
			System.out.println("*********************************");
			System.out.println("********** HEALTH-KIT ***********");
			System.out.println("*********************************");
			Player p = (Player) other;
			int newHealth = p.getPlayerHealth().getUnits() + INCRESE_HEALTH;
			p.getPlayerHealth().setUnits(newHealth);
		}
	}
}
