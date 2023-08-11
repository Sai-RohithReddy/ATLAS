import java.util.LinkedList;
import java.util.Queue;

public class LiftManager {
    private Building building;
    private Queue<Integer> upRequest;
    private Queue<Integer> downRequest;

    public LiftManager(Building building) {
        this.building = building;
        this.upRequest = new LinkedList<>();
        this.downRequest = new LinkedList<>();
    }

    public void requestElevator(int floor, Elevator.Direction direction) {
        if (direction == Elevator.Direction.UP) {
            upRequest.add(floor);
        } else if (direction == Elevator.Direction.DOWN) {
            downRequest.add(floor);
        }

        for (Elevator elevator : building.getElevators()) {
            if (elevator.isIdle()) {
                if (!upRequest.isEmpty()) {
                    int flor = upRequest.poll();
                    moveElevator(elevator, flor);
                } else if (!downRequest.isEmpty()) {
                    int flor = downRequest.poll();
                    moveElevator(elevator, flor);
                }
            }
        }
    }

    private void moveElevator(Elevator elevator, int destinationFloor) {
        int currentFloor = elevator.getCurrentFloor();
        if (currentFloor < destinationFloor) {
            elevator.setDirection(Elevator.Direction.UP);
            while (elevator.getCurrentFloor() < destinationFloor) {
                elevator.moveUp();
            }
        } else if (currentFloor > destinationFloor) {
            elevator.setDirection(Elevator.Direction.DOWN);
            while (elevator.getCurrentFloor() > destinationFloor) {
                elevator.moveDown();
            }
        }

        elevator.setIdle();
    }
}
