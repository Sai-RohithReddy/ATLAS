package com.rohith.rd;

import java.util.HashMap;

public class SideObjectFactory {
	private HashMap<Integer, CallBackSideObject> callBacks = new HashMap<>();
	private static SideObjectFactory instance = new SideObjectFactory();

//	private SideObjectFactory() {
//		
//	}

	public void registerCallBack(int key, CallBackSideObject callBack) {
		callBacks.put(key, callBack);
	}

	public SideObject createSideObject(int key) {
		CallBackSideObject cb = callBacks.get(key);
		return cb.createSideObject();
	}

	public static SideObjectFactory getInstance() {
		return instance;
	}
}
