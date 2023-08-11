package com.rohith.rd;

public abstract class PowerUp extends GameObject{
	private static final int DURATION = 5;
	protected int countdown = DURATION;
	public static final int POWERUP_COUNT = 2;
	public abstract void applyPoserUp(Player player, int damage, int cash);
	public boolean isActive() {
		return true;
	}
	@Override
	public String toString() {
		return "DEFAULT";
	}
}
