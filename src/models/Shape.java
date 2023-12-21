package models;

import javax.swing.*;
import java.lang.reflect.Array;
import java.time.Period;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<Point>();

    public ArrayList<Point> GetPoints(){
        return points;
    }

    public void AddPoint(Point point){
        points.add(point);
    }
    public double CalculateSide(Point first, Point second){
        return Math.sqrt((Math.pow((first.GetX() - second.GetX()), 2) + (Math.pow((first.GetY() - second.GetY()), 2))));
    }
    public double CalculatePerimeter(){
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            if(i == (points.size() - 1)){
                perimeter += CalculateSide(points.get(i), points.getFirst());
                return perimeter;
            }
            perimeter += CalculateSide(points.get(i), points.get(i + 1));
        }
        return perimeter;
    }

    public double GetLongest(){
        double max = -Double.MAX_VALUE;
        for (int i = 0; i < points.size(); i++) {
            if(i == (points.size() - 1)){
                if(max < CalculateSide(points.get(i), points.getFirst())) max = CalculateSide(points.get(i), points.getFirst());
                return max;
            }
            if(max < CalculateSide(points.get(i), points.get(i + 1))) max = CalculateSide(points.get(i), points.get(i + 1));
        }
        return max;
    }

    public void GetAverageSide(){
        double average = 0.0;
        for (int i = 0; i < points.size(); i++) {
            average += CalculateSide(points.get(i), points.get(i));
        }
        average /= points.size();
    }
}
