package com.poash;

public class Car {
	private String manufacturer;
	private float fuel;
	private float speed;
	private int reistrationNum;
	private boolean isRunning;

	public Car(String manufacturer, float fuel, int reistrationNum) {
		this.manufacturer = manufacturer;
		this.fuel = fuel;
		this.reistrationNum = reistrationNum;
		this.speed = 0;
		this.isRunning = false;
	}

	public void SwitchOn() {
		isRunning = true;
	}

	public void SwitchOff() {
		isRunning = false;
	}

	public void Accelerate() {
		if (!isRunning)
			return;

		speed += 2;
		fuel -= 0.5f;
	}

	public void Brake() {
		speed = 0;
	}

	public void Dashbord() {
		System.out.println("Speed : " + speed);
		System.out.println("Fuel : " + fuel);
	}
	
	public void FillFuel(float amount) {
		this.fuel += amount;
	}
	
	public float GetFuel() {
		return this.fuel;
	}
	
	public float GetSpeed() {
		return this.speed;
	}
}
