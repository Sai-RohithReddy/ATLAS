import java.util.ArrayList;

class Building {
    private int numberOfFloors;
    ArrayList<Elevator> elevators;

    public Building(int numberOfFloors, int numberOfElevators) {
        this.numberOfFloors = numberOfFloors;
        this.elevators = new ArrayList<>();
        for (int i = 0; i < numberOfElevators; i++) {
            this.elevators.add(new Elevator());
        }
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public ArrayList<Elevator> getElevators() {
        return elevators;
    }

}
