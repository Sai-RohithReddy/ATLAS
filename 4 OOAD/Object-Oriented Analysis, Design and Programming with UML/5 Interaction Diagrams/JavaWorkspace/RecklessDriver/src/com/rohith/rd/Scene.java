package com.rohith.rd;

import java.util.ArrayList;
import java.util.Random;

public class Scene {
	private static final int SIDEOBJECT_COUNT = 2;
	private static final int TRAFFIC_COUNT = 2;
	private static final int NPC_TYPES = 2;
	private ArrayList<Vehicle> trafficList = new ArrayList<>();
	private ArrayList<SideObject> sideList = new ArrayList<>();
	private Player player;
	private Random random = new Random();

	public void start(Player player) {
		this.player = player;
	}

	public void execute() {

		if (trafficList.size() > 6) {
			trafficList.remove(0);
		}
		generateSideObject();
		generateTraffic();
		displaySideObjects();
		displayTraffic();
		collide();
	}

	public void collide() {
		GameObject go = null;
		if (random.nextBoolean() == false)
			return;
		switch (random.nextInt(NPC_TYPES)) {
		case 0:// Sideobjects
			go = sideList.get(random.nextInt(sideList.size()));
			break;
		case 1:// Traffic
			go = trafficList.get(random.nextInt(trafficList.size()));
			break;
		}
		go.onCollision(player);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void generateSideObject() {
		if (sideList.size() > 6) {
			sideList.remove(0);
		}
		SideObject sideObject = null;
		switch (random.nextInt(SIDEOBJECT_COUNT)) {
		case 0: // Firehydrant
			sideObject = new FireHydrant(5, 10);
			break;
		case 1: // Letterbox
			sideObject = new LetterBox(8, 10);
			break;
		}
		sideList.add(sideObject);
	}

	private void generateTraffic() {
		if (sideList.size() > 6) {
			sideList.remove(0);
		}
		Vehicle vehicle = null;
		switch (random.nextInt(TRAFFIC_COUNT)) {
		case 0: // Firehydrant
			vehicle = new Sedan(15, 80);
			break;
		case 1: // Letterbox
			vehicle = new Van(18, 90);
			break;
		}
		trafficList.add(vehicle);
	}

	private void displaySideObjects() {
		System.out.println("<<<< SIDEOBJECTS >>>>");
		for (SideObject obj : sideList) {
			System.out.println(obj.getName());
		}
	}

	private void displayTraffic() {
		System.out.println("<<<< TRAFFIC >>>>");
		for (Vehicle obj : trafficList) {
			System.out.println(obj.getName());
		}
	}
}
