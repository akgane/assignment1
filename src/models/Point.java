package models;

public class Point {
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void SetPointX(double x){
        this.x = x;
    }
    public void SetPointY(double y){
        this.y = y;
    }
    public void SetPoints(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double GetX(){
        return x;
    }
    public double GetY(){
        return y;
    }
    public double[] GetPoints(){
        return new double[]{x, y};
    }
    public String ToString(){
        return String.valueOf(x) + " : " + String.valueOf(y);
    }
}
