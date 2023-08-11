package com.rohith.rd;

public class PowerUpFactory {
	public static PowerUp createPoserUp(int key) {
		switch (key) {
		case -1:
			return new NoPowerUP();
		case 0:
			return new HealthKit();
		case 1:
			return new Armor();
		}
		return null;
	}
}
