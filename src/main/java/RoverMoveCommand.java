public class RoverMoveCommand extends AbstractRoverCommand {
    public RoverMoveCommand(Rover rover){
        super(rover);
    }
    @Override
    public void execute() {
        this.rover.move();
    }
}
