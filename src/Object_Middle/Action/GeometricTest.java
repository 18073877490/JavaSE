package Object_Middle.Action;

import Object_Middle.Class.Circle;
import Object_Middle.Class.GeometricObject;
import Object_Middle.Class.MyRectangle;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(2.0, "blue", 1.0);
        GeometricObject rectangle = new MyRectangle(2.5, 4.0, "green", 1.0);

        System.out.println(equalsArea(circle, rectangle));

        displayGeometricObject(circle);
        displayGeometricObject(rectangle);

    }

    public static boolean equalsArea(GeometricObject a, GeometricObject b) {
        return a.findArea() == b.findArea();
    }

    public static void displayGeometricObject(GeometricObject a) {
        System.out.println(a.findArea());
    }
}
