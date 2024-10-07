import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Square(5, 5, 10));
        shapes.add(new Rectangle(3, 3, 8, 6));
        shapes.add(new Circle(7, 7, 5));
        shapes.add(new Square(2, 2, 5));
        shapes.add(new Circle(4, 4, 3));
        shapes.add(new Rectangle(5, 2, 10, 11));

        OrderPrinter.printShapesInOrder(shapes);

    }
}