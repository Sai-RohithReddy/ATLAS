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
		generatePowerUps();
		displaySideObjects();
		displayTraffic();
		collide();
	}

	public void generatePowerUps() {
		int spawnIndex = 0;
		switch (player.getPlayerHealth().getPlayerState()) {
		case HEALTHY:
			spawnIndex = random.nextInt(10);
			break;
		case INJURED:
			spawnIndex = random.nextInt(6);
			break;
		case CRITICAL:
			spawnIndex = random.nextInt(3);
			break;
		case DEAD:
			spawnIndex = 100;
			break;
		}
		if (spawnIndex < PowerUp.POWERUP_COUNT) {
			if (spawnIndex != 0 && player.getPowerUp().isActive())
				return;
			PowerUpFactory.createPoserUp(spawnIndex).onCollision(player);
		}
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

		switch (player.getPlayerHealth().getPlayerState()) {
		case HEALTHY:
			if (sideList.size() > 6) {
				sideList.remove(0);
			}
			break;
		case INJURED:
			while (sideList.size() > 4) {
				sideList.remove(0);
			}
			break;
		case CRITICAL:
			while (sideList.size() > 2) {
				sideList.remove(0);
			}
			break;
		case DEAD:
			break;
		}

		sideList.add(SideObjectFactory.getInstance().createSideObject(random.nextInt(SIDEOBJECT_COUNT)));
	}

	private void generateTraffic() {

		switch (player.getPlayerHealth().getPlayerState()) {
		case HEALTHY:
			if (trafficList.size() > 6) {
				trafficList.remove(0);
			}
			break;
		case INJURED:
			while (trafficList.size() > 4) {
				trafficList.remove(0);
			}
			break;
		case CRITICAL:
			while (trafficList.size() > 2) {
				trafficList.remove(0);
			}
			break;
		case DEAD:
			break;
		}

		trafficList.add(VehicleFactory.getInstance().createVehicle(random.nextInt(TRAFFIC_COUNT)));
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
