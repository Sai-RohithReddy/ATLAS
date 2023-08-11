package BuildVehicle;

public class HybridCar extends Vehicle {

    public HybridCar(int fuelLevel, String name) {
        super(fuelLevel, name);
    }

    @Override
    public void reFuel(int value) {
        setFuel(value);
    }

    @Override
    void wheelType() {
        System.out.println("4 Wheeler");
    }

}
