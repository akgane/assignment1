package models;

import javax.swing.*;
import java.lang.reflect.Array;
import java.time.Period;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<Point>();

    public ArrayList<Point> getPoints(){
        return points;
    }

    public void addPoint(Point point){
        points.add(point);
    }

    public double calculatePerimeter(){
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            if(i == (points.size() - 1)){
                perimeter += points.get(i).getDistance(points.get(0));
                return perimeter;
            }
            perimeter += points.get(i).getDistance(points.get(i + 1));
        }
        return perimeter;
    }

    public double getLongest(){
        double max = -Double.MAX_VALUE;
        for (int i = 0; i < points.size(); i++) {
            if(i == (points.size() - 1)){
                if(max < points.get(i).getDistance(points.getFirst())) max = points.get(i).getDistance(points.getFirst());
                return max;
            }
            if(max < points.get(i).getDistance(points.get(i + 1))) max = points.get(i).getDistance(points.get(i + 1));
        }
        return max;
    }

    public double getAverageSide(){
        double average = 0.0;
        for (int i = 0; i < points.size(); i++) {
            if(i == points.size() - 1){
                average += points.get(i).getDistance(points.getFirst());
                break;
            }
            average += points.get(i).getDistance(points.get(i));
        }
        return average / points.size();
    }
}
