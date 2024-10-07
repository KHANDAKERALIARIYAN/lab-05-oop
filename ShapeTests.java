import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTests {

    @Test
    public void testSquareArea() {
        Shape square = new Square(0, 0, 4);
        assertEquals(16.0, square.getArea(), "Square area should be 16");
    }

    @Test
    public void testRectangleArea() {
        Shape rectangle = new Rectangle(0, 0, 4, 5);
        assertEquals(20.0, rectangle.getArea(), "Rectangle area should be 20");
    }

    @Test
    public void testCircleArea() {
        Shape circle = new Circle(0, 0, 3);
        assertEquals(Math.PI * 9, circle.getArea(), "Circle area should be π*9");
    }

    @Test
    public void testSortByArea() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(0, 0, 3));
        shapes.add(new Circle(0, 0, 1));
        shapes.add(new Rectangle(0, 0, 2, 2));

        OrderPrinter.printShapesInOrder(shapes);
        assertEquals(Math.PI, shapes.get(0).getArea(), "Circle should be first by area");
        assertEquals(4, shapes.get(1).getArea(), "Rectangle should be second by area");
        assertEquals(9, shapes.get(2).getArea(), "Square should be third by area");
    }

    @Test
    public void testSortByXWhenAreasEqual() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5, 0, 3));
        shapes.add(new Square(2, 0, 3));
        shapes.add(new Square(3, 0, 3));

        OrderPrinter.printShapesInOrder(shapes);

        assertEquals(2, shapes.get(0).getX(), "Shape with x=2 should come first");
        assertEquals(3, shapes.get(1).getX(), "Shape with x=3 should come second");
        assertEquals(5, shapes.get(2).getX(), "Shape with x=5 should come third");
    }

    @Test
    public void testSortByYWhenXAndAreasEqual() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(2, 1, 3));
        shapes.add(new Square(2, 3, 3));
        shapes.add(new Square(2, 2, 3));

        OrderPrinter.printShapesInOrder(shapes);

        assertEquals(1, shapes.get(0).getY(), "Shape with y=1 should come first");
        assertEquals(2, shapes.get(1).getY(), "Shape with y=2 should come second");
        assertEquals(3, shapes.get(2).getY(), "Shape with y=3 should come third");
    }

    @Test
    public void testZeroAreaShape() {
        Shape rectangle = new Rectangle(0, 0, 0, 0);
        assertEquals(0.0, rectangle.getArea(), "Rectangle with zero dimensions should have area 0");
    }

    @Test
    public void testLargeValues() {
        Shape circle = new Circle(1000, 1000, 100);
        assertEquals(Math.PI * 100 * 100, circle.getArea(), "Circle with radius 100 should have area π*100^2");
        assertEquals(1000, circle.getX(), "X coordinate should be 1000");
        assertEquals(1000, circle.getY(), "Y coordinate should be 1000");
    }
    @Test
    public void testDrawMethod() {
        Shape square = new Square(5, 5, 10);
        String expectedOutput = "Drawing SQUARE at (5, 5) and Area: 100.0";
        assertEquals(expectedOutput, square.draw(), "Square draw method should return the correct string");
    }

    @Test
    public void testMixedShapesSorting() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5, 5, 2));
        shapes.add(new Rectangle(3, 3, 2, 2));
        shapes.add(new Square(1, 1, 2));

        OrderPrinter.printShapesInOrder(shapes);

        assertEquals(4, shapes.get(0).getArea(), "Rectangle should come first by area");
        assertEquals(4, shapes.get(1).getArea(), "Square should come second by area");
        assertEquals(Math.PI * 4, shapes.get(2).getArea(), "Circle should come last by area");
    }
}
