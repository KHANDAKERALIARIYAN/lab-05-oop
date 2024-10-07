public class Circle extends Shape{
    private int radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String draw() {
        return "Drawing CIRCLE at (" + x + ", " + y + ") and Area: " + (getArea());
    }
}
