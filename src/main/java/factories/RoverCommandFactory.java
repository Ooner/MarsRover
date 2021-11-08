package factories;

import commands.RoverCommand;
import commands.RoverLeftCommad;
import commands.RoverMoveCommand;
import commands.RoverRightCommand;
import constants.Constants;
import main.Rover;

import java.util.ArrayList;

public class RoverCommandFactory {
    public static ArrayList<RoverCommand> createRoverCommand(Rover rover, String commands){
        ArrayList<RoverCommand> commandsList = new ArrayList<>();
        for(String command : commands.split("")){
            switch (command) {
                case Constants.LEFT -> commandsList.add(new RoverLeftCommad(rover));
                case Constants.RIGHT ->  commandsList.add(new RoverRightCommand(rover));
                case Constants.MOVE ->  commandsList.add(new RoverMoveCommand(rover));
                default -> throw new IllegalStateException("Unexpected direction: " + command);
            }
        }
        return commandsList;
    }
}
