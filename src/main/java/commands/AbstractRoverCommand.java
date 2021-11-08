package commands;

import main.Rover;

public abstract class AbstractRoverCommand implements RoverCommand {
    public Rover rover;
    public AbstractRoverCommand(Rover rover){
        this.rover = rover;
    }
    public abstract  void execute();
}
