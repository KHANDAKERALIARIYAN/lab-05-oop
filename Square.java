class Square extends Shape{
    private int side;
    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }
    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public String draw(){
        return "Drawing SQUARE at (" + x + ", " + y + ") and Area: " + (getArea());
    }
}
