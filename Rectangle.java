public class Rectangle extends Shape{
    private int height;
    private int width;
    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public String draw() {
        return "Drawing RECTANGLE at (" + x + ", " + y + ") and Area: " + (getArea());
    }
}
