package BuildVehicle;

public abstract class Vehicle {
    private int fuelLevel;
    String name;

    public Vehicle(int fuelLevel, String name) {
        this.fuelLevel = fuelLevel;
        this.name = name;
    }

    abstract void reFuel(int value);

    abstract void wheelType();

    void start() {
        if (fuelLevel > 0) {
            System.out.println(name + " Started..");
        } else {
            System.out.printf("Low fuel in %s!!\n", name);
        }

    }

    void stop() {
        System.out.println(name + " Stopped..");
    }

    public void getFuel() {
        System.out.println("Current fuel level: " + fuelLevel);
    }

    public void setFuel(int value) {
        this.fuelLevel = value;
    }

}
