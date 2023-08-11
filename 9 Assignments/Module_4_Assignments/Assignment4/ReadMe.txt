To design a lift system in Java, we will follow an Object-Oriented approach and use classes to represent elevators and the building. We will also implement a basic elevator scheduling algorithm to minimize waiting times.

Let's start with the classes for Elevator and Building:

1. Elevator Class:

```java
public class Elevator {
    private int currentFloor;
    private Direction direction;
    private boolean isIdle;

    public enum Direction {
        UP, DOWN, IDLE
    }

    public Elevator() {
        this.currentFloor = 1;
        this.direction = Direction.IDLE;
        this.isIdle = true;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public boolean isIdle() {
        return isIdle;
    }

    public void moveUp() {
        this.currentFloor++;
    }

    public void moveDown() {
        this.currentFloor--;
    }

    public void setIdle() {
        this.isIdle = true;
        this.direction = Direction.IDLE;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
```

2. Building Class:

```java
import java.util.ArrayList;
import java.util.List;

public class Building {
    private int numFloors;
    private List<Elevator> elevators;

    public Building(int numFloors, int numElevators) {
        this.numFloors = numFloors;
        this.elevators = new ArrayList<>();
        for (int i = 0; i < numElevators; i++) {
            elevators.add(new Elevator());
        }
    }

    public int getNumFloors() {
        return numFloors;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }
}
```

3. LiftSystem Class:

```java
import java.util.LinkedList;
import java.util.Queue;

public class LiftSystem {
    private Building building;
    private Queue<Integer> upRequests;
    private Queue<Integer> downRequests;

    public LiftSystem(Building building) {
        this.building = building;
        this.upRequests = new LinkedList<>();
        this.downRequests = new LinkedList<>();
    }

    public void requestElevator(int floor, Elevator.Direction direction) {
        if (direction == Elevator.Direction.UP) {
            upRequests.add(floor);
        } else if (direction == Elevator.Direction.DOWN) {
            downRequests.add(floor);
        }

        processRequests();
    }

    private void processRequests() {
        for (Elevator elevator : building.getElevators()) {
            if (elevator.isIdle()) {
                if (!upRequests.isEmpty()) {
                    int floor = upRequests.poll();
                    moveElevator(elevator, floor);
                } else if (!downRequests.isEmpty()) {
                    int floor = downRequests.poll();
                    moveElevator(elevator, floor);
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

    public static void main(String[] args) {
        int numFloors = 40;
        int numElevators = 2;
        Building building = new Building(numFloors, numElevators);
        LiftSystem liftSystem = new LiftSystem(building);

        // Test the lift system with some requests
        liftSystem.requestElevator(5, Elevator.Direction.UP);
        liftSystem.requestElevator(15, Elevator.Direction.DOWN);
        liftSystem.requestElevator(20, Elevator.Direction.UP);
        // Add more requests as needed

        // The lift system will process the requests and move the elevators accordingly.
    }
}
```

This basic implementation demonstrates how elevator requests are added to queues and processed by elevators accordingly. The elevators will move up or down based on the requests and become idle when they reach their destination floor. The system prioritizes serving requests in the order they were received.

For high-rise buildings with more than 20 floors, you can adjust the `numElevators` value in the `main` method to accommodate the number of floors. In general, having one elevator for every 15-20 floors is a reasonable approach.

For further optimization, you can consider implementing more advanced elevator scheduling algorithms, such as destination dispatch or predictive models, to reduce waiting times even more. These algorithms can use historical data and passenger patterns to predict elevator demand and allocate elevators more efficiently.