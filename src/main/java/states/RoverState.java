package states;

import main.Coordinate;

public abstract class RoverState {
    public Coordinate coordinate;

    public RoverState(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public abstract RoverState turnLeft();
    public abstract RoverState turnRight();
    public abstract void move();
    public abstract String getDirection();

    @Override
    public String toString() {
        return String.format("%d %d %s",this.coordinate.getX(),this.coordinate.getY(),this.getDirection());
    }
}
