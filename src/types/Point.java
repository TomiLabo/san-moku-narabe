package types;

public class Point {
    
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int X() {
        return this.x;
    }

    public int Y() {
        return this.y;
    }
}
