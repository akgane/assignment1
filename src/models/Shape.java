package models;

import javax.swing.*;
import java.lang.reflect.Array;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

public class Shape {
    private ArrayList<Point> points = new ArrayList<Point>();

    public ArrayList<Point> getPoints(){
        return points;
    }

    public void addPoint(Point point){
        points.add(point);
    }

    private double[] getSides(){
        double[] sides = new double[points.size()];
        for (int i = 0; i < sides.length; i++) {
            int index = (i + 1) % sides.length;
            double side = points.get(i).getDistance(points.get(index));
            sides[i] = side;
        }
        return sides;
    }

    public double calculatePerimeter(){
        return Arrays.stream(getSides()).sum();
    }

    public double getLongest(){
        return Arrays.stream(getSides()).max().getAsDouble();
    }

    public double getAverageSide(){
        return Arrays.stream(getSides()).sum() / getSides().length;
    }
}
