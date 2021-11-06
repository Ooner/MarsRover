import java.util.ArrayList;
import java.util.Scanner;

public class MarsRover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sizes = sc.nextLine().split(" ");
        Coordinate.maxX = Integer.parseInt(sizes[0]);
        Coordinate.maxY = Integer.parseInt(sizes[1]);
        ArrayList<Rover> rovers = new ArrayList<>();

        while (!sc.hasNext("exit")) {
            String[] roverPos = sc.nextLine().split(" ");
            int x = Integer.parseInt(roverPos[0]);
            int y =  Integer.parseInt(roverPos[1]);
            String direction = roverPos[2];
            Coordinate coordinate = new Coordinate(x,y);
            RoverState roverState = RoverStateFactory.createRoverState(coordinate,direction);
            String commands = sc.nextLine();
            rovers.add(new Rover(roverState,commands));
        }

        for(Rover rover:rovers ) {
            rover.process();
            System.out.println(rover.toString());
        }
    }
}
