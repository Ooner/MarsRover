package states;

import constants.Constants;
import main.Coordinate;

public class RoverWestState extends RoverState{
    public RoverWestState(Coordinate coordinate){
        super(coordinate);
    }

    @Override
    public RoverState turnLeft() {
        return new RoverSouthState(this.coordinate);
    }

    @Override
    public RoverState turnRight() {
        return new RoverNorthState(this.coordinate);
    }

    @Override
    public void move() {
        this.coordinate.setX(this.coordinate.getX()-1);
    }

    @Override
    public String getDirection() {
        return Constants.WEST;
    }
}
