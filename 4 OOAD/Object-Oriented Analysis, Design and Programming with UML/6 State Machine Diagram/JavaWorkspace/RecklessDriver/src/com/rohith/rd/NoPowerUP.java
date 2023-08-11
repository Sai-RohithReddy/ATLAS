package com.rohith.rd;

public class NoPowerUP extends PowerUp {

	@Override
	public void applyPoserUp(Player player, int damage, int cash) {
		int newHealth = player.getPlayerHealth().getUnits() - damage - player.getPlayerVehicle().getStrenght();
		player.getPlayerHealth().setUnits(newHealth);
		GameManager.getInstance().addCash(cash);
	}
	
	@Override
	public boolean isActive() {
		return false;
	}

}
