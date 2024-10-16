package patterns.prototype.shape;

public class Point implements Prototype, Shape {

    private int x;
    private int y;

    @Override
    public Object copy() {
        Point newPoint = new Point();
        newPoint.setX(this.x);
        newPoint.setY(this.y);
        return newPoint;
    }

    @Override
    public String draw() {
        return "(" + x + " " + y + ")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        this.x = dx;
        this.y = dy;
    }

    public int getX() {
        return x;
    }

    public Point setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Point setY(int y) {
        this.y = y;
        return this;
    }
}
