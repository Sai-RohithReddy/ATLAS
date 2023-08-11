package com.rohith.oop;

public class GameObject {
	private String name;

	public GameObject(String name) {
		this.name = name;
	}

	public GameObject() {

	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
	public void onCollision(GameObject other) {
		System.out.println("Collided with GameObject");
	}
}
