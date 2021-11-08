public class Rover {
    private RoverState state;

    public Rover(RoverState state) {
        this.state = state;
    }

    public void turnLeft(){
        this.setState(this.state.turnLeft());
    }

    public void turnRight(){
        this.setState(this.state.turnRight());
    }

    public void move(){
        this.state.move();
    }

    private void setState(RoverState state) {
        this.state = state;
    }

    public RoverState getState(){
        return this.state;
    }

    @Override
    public String toString() {
        return this.state.toString();
    }
}
