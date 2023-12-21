import models.Point;
import models.Shape;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("R:/Programming/Java/test/src/source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while(sc.hasNext()){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.AddPoint(point);
        }

        System.out.println(shape.CalculatePerimeter());
        System.out.println(shape.GetLongest());
    }
}