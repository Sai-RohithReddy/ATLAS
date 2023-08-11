class Elevator {
    private int currentFloor;
    private boolean isIdle;
    private Direction direction;
    
    enum Direction {
        UP, DOWN, IDLE;
    }

    Elevator() {
        this.currentFloor = 1;
        this.isIdle = true;
        this.direction = Direction.IDLE;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public boolean isIdle() {
        return this.isIdle;
    }

    public void setIdle() {
        this.isIdle = true;
        this.direction = Direction.IDLE;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direaction) {
        this.direction = direaction;
    }

    public void moveUp() {
        this.currentFloor++;
    }

    public void moveDown() {
        this.currentFloor--;
    }
}