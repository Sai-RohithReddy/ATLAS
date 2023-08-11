package com.poash;

public class Program {

	public static void main(String[] args) {
		Car car = new Car("Audi", 5, 999);
		car.SwitchOn();
		car.Accelerate();
		car.Accelerate();
		System.out.println("Speed : " + car.GetSpeed());
		car.Accelerate();
		car.Dashbord();
	}

}
