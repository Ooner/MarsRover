public class RoverNorthState  extends RoverState {
    public RoverNorthState(Coordinate coordinate){
        super(coordinate);
    }

    @Override
    public RoverState turnLeft() {
        return new RoverWestState(this.coordinate);
    }

    @Override
    public RoverState turnRight() {
        return new RoverEastState(this.coordinate);
    }

    @Override
    public void move() {
        this.coordinate.setY(this.coordinate.getY()+1);
    }

    @Override
    public String getDirection() {
        return Constants.NORTH;
    }
}
