package main;

public class Coordinate {
    private int x;
    private int y;
    public static int maxX;
    public static int maxY;

    public Coordinate(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        if(x < 0 || x > maxX) throw new IndexOutOfBoundsException("Wrong X coordinates");
        this.x = x;
    }

    public void setY(int y) {
        if(y < 0 || y > maxY) throw new IndexOutOfBoundsException("Wrong Y coordinate");
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
