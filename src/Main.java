import models.Point;
import models.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 3);
        Point p3 = new Point(4, 2);
        Point p4 = new Point(3, -1);

        shape.AddPoint(p1);
        shape.AddPoint(p2);
        shape.AddPoint(p3);
        shape.AddPoint(p4);

        System.out.println(shape.CalculatePerimeter());
        System.out.println(shape.GetLongest());
        //System.out.println(shape.GetPoints().getFirst().ToString());
    }
}