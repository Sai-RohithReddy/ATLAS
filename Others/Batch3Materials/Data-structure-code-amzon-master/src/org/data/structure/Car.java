package org.data.structure;
class Car
{
  public void AdjustSeats()
  {
	  System.out.println("Seat adjustments works!");
  }
  public void HonkHorn()
  {
	  System.out.println("Horn is Honked!");
  }
  
  public static void main(String[] args) {
		
		Car car = new Car();
		car.AdjustSeats();
		car.HonkHorn();
	}
}

