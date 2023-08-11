package com.rohith.rd;

public class Main {
	private static void initializeSideObject() {
		SideObjectFactory.getInstance().registerCallBack(0, () -> {
			return new LetterBox(8, 13);
		});
		SideObjectFactory.getInstance().registerCallBack(1, () -> {
			return new FireHydrant(5, 10);
		});
	}

	private static void initializeVehicle() {
		VehicleFactory.getInstance().registerCallBack(0, () -> {
			return new Sedan(15, 80);
		});
		VehicleFactory.getInstance().registerCallBack(0, () -> {
			return new Van(18, 90);
		});
	}

	private static void initialize() {
		initializeSideObject();
		initializeVehicle();
	}

	public static void main(String[] args) {
		initialize();
		GameManager.getInstance().newGame();
	}

}
