package commands;

import commands.AbstractRoverCommand;
import main.Rover;

public class RoverRightCommand extends AbstractRoverCommand {
    public RoverRightCommand(Rover rover){
        super(rover);
    }
    @Override
    public void execute() {
        this.rover.turnRight();
    }
}
