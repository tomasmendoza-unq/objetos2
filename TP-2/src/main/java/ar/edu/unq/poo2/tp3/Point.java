package ar.edu.unq.poo2.tp3;

public class Point {

    private int x;

    private int y;

    public Point (){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public Point sumPoints(Point point1, Point point2){
        int newX = point1.getX() + point2.getX();
        int newY = point1.getY() + point2.getY();
        return new Point(newX, newY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
