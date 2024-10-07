abstract class Shape {
    protected int x;
    protected int y;
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract double getArea();
    public abstract String draw();
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
