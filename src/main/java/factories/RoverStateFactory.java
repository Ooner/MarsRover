package factories;

import constants.Constants;
import main.Coordinate;
import states.*;

public class RoverStateFactory {
    public static RoverState createRoverState(Coordinate coordinate, String direction){
        return switch (direction) {
            case Constants.NORTH -> new RoverNorthState(coordinate);
            case Constants.SOUTH -> new RoverSouthState(coordinate);
            case Constants.EAST -> new RoverEastState(coordinate);
            case Constants.WEST -> new RoverWestState(coordinate);
            default -> throw new IllegalStateException("Unexpected direction: " + direction);
        };
    }
}
