package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Shape {
    private ArrayList<Point> points = new ArrayList<>();

    public ArrayList<Point> getPoints(){
        return points;
    }

    public void addPoint(Point point){
        points.add(point);
    }

    private double[] getSides(){
        double[] sides = new double[points.size()];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = points.get(i).getDistance(points.get((i + 1) % sides.length));
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
