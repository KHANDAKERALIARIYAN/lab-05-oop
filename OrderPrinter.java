import java.util.List;
import java.util.*;

class OrderPrinter {
    public static void printShapesInOrder(List<Shape> shapes) {
        for (int i = 0; i < shapes.size() - 1; i++) {
            for (int j = 0; j < shapes.size() - 1 - i; j++) {
                Shape s1 = shapes.get(j);
                Shape s2 = shapes.get(j + 1);

                if (s1.getArea() > s2.getArea()) {
                    swap(shapes, j, j + 1);
                } else if (s1.getArea() == s2.getArea()) {
                    if (s1.getX() > s2.getX()) {
                        swap(shapes, j, j + 1);
                    } else if (s1.getX() == s2.getX()) {
                        if (s1.getY() > s2.getY()) {
                            swap(shapes, j, j + 1);
                        }
                    }
                }
            }
        }
        for (Shape shape : shapes) {
            System.out.println(shape.draw());
        }
    }
    private static void swap(List<Shape> shapes, int i, int j) {
        Shape temp = shapes.get(i);
        shapes.set(i, shapes.get(j));
        shapes.set(j, temp);
    }
}

