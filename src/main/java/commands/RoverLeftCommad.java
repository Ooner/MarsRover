package commands;

import main.Rover;

public class RoverLeftCommad extends AbstractRoverCommand {

    public RoverLeftCommad(Rover rover){
        super(rover);
    }
    @Override
    public void execute() {
        this.rover.turnLeft();
    }
}
