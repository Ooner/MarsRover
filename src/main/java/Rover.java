public class Rover {
    private RoverState state;
    private String commands;

    public Rover(RoverState state,String commands) {
        this.state = state;
        this.commands = commands;
    }

    public void process(){
        for(String command : commands.split("")){
            switch (command) {
                case Constants.LEFT -> setState(this.state.turnLeft());
                case Constants.RIGHT -> setState(this.state.turnRight());
                case Constants.MOVE -> this.state.move();
            }
        }
    }

    private void setState(RoverState state) {
        this.state = state;
    }

    public RoverState getState(){
        return this.state;
    }


    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return this.state.toString();
    }
}
