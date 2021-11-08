package main;

import commands.RoverCommand;
import factories.RoverCommandFactory;
import factories.RoverStateFactory;
import states.RoverState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MarsMainRover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sizes = sc.nextLine().split(" ");
        Coordinate.maxX = Integer.parseInt(sizes[0]);
        Coordinate.maxY = Integer.parseInt(sizes[1]);
        HashMap<Rover,ArrayList<RoverCommand>> roverCommandsMap = new HashMap<>();

        while (!sc.hasNext("exit")) {
            String[] roverPos = sc.nextLine().split(" ");
            int x = Integer.parseInt(roverPos[0]);
            int y =  Integer.parseInt(roverPos[1]);
            String direction = roverPos[2];
            Coordinate coordinate = new Coordinate(x,y);
            RoverState roverState = RoverStateFactory.createRoverState(coordinate,direction);
            String commands = sc.nextLine();
            Rover rover = new Rover(roverState);
            ArrayList<RoverCommand> roverRoverCommands = RoverCommandFactory.createRoverCommand(rover,commands);
            roverCommandsMap.put(rover, roverRoverCommands);
        }

        roverCommandsMap.forEach((k, v) -> {
            v.forEach(RoverCommand::execute);
            System.out.println(k.toString());
        });
    }
}
