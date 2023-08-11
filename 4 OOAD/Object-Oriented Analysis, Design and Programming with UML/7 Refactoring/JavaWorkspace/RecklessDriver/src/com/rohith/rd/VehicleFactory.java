package com.rohith.rd;

import java.util.HashMap;

public class VehicleFactory {
	private HashMap<Integer, CallBackVehicle> callBacks = new HashMap<>();
	private static VehicleFactory instance = new VehicleFactory();

	public void registerCallBack(int key, CallBackVehicle callBack) {
		callBacks.put(key, callBack);
	}

	public Vehicle createVehicle(int key) {
		CallBackVehicle cb = callBacks.get(key);
		return cb.createVehicle();
	}

	public static VehicleFactory getInstance() {
		return instance;
	}
}
