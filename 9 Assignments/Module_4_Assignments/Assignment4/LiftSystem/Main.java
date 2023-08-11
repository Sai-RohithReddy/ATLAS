public class Main {
    public static void main(String[] args) {
        Building building = new Building(40, 2);
        LiftManager liftManager = new LiftManager(building);

        liftManager.requestElevator(1, Elevator.Direction.UP);
        liftManager.requestElevator(20, Elevator.Direction.DOWN);
    }
}
