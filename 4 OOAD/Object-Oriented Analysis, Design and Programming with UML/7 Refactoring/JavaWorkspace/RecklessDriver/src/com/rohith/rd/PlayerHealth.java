package com.rohith.rd;

public class PlayerHealth {
	private int healthUnits = 100;
	private PlayerState playerStart = PlayerState.HEALTHY;

	public int getUnits() {
		return healthUnits;
	}

	public void setUnits(int units) {
		healthUnits = units < 0 ? 0 : units;
		updateState();
	}

	public void updateState() {
		if (healthUnits > 70) {
			playerStart = PlayerState.HEALTHY;
		} else if (healthUnits >= 25 && healthUnits <= 70) {
			playerStart = PlayerState.INJURED;
		} else if (healthUnits >= 1 && healthUnits < 25) {
			playerStart = PlayerState.CRITICAL;
		} else {
			playerStart = PlayerState.DEAD;
		}
		System.out.println("Current state: " + playerStart);
	}

	public PlayerState getPlayerState() {
		return playerStart;
	}
}
