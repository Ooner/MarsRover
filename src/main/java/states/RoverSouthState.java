package states;

import constants.Constants;
import main.Coordinate;

public class RoverSouthState extends RoverState{
    public RoverSouthState(Coordinate coordinate){
        super(coordinate);
    }

    @Override
    public RoverState turnLeft() {
        return new RoverEastState(this.coordinate);
    }

    @Override
    public RoverState turnRight() {
        return new RoverWestState(this.coordinate);
    }

    @Override
    public void move() {
        this.coordinate.setY(this.coordinate.getY() -1 );
    }

    @Override
    public String getDirection() {
        return Constants.SOUTH;
    }
}
