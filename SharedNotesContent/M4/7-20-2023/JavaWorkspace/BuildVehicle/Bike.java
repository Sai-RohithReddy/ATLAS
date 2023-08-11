package BuildVehicle;

public class Bike extends Vehicle {

    public Bike(int fuelLevel, String name) {
        super(fuelLevel, name);
    }

    @Override
    public void reFuel(int value) {
        setFuel(value);
    }

    @Override
    void wheelType() {
        System.out.println("2 Wheeler");
    }

}
