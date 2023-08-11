package BuildVehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle electirc = new ElectricCar(50, "Electric Car");
        Vehicle hybrid = new HybridCar(0, "Hybrid Car");
        Vehicle bike = new Bike(70, "Bike");

        electirc.start();
        hybrid.start();

        hybrid.reFuel(20);
        hybrid.start();
        hybrid.wheelType();

        bike.start();
        bike.wheelType();
    }
}
