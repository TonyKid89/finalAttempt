package boss.ant;

public class Point {
    double x;
    double y;

    Point (double x, double y){
        this.x=x;
        this.y =y;
    }

    public static double distance(Point p1, Point p2) {
        double x = p2.x - p1.x;
        double y = p2.y - p1.y;
        return Math.sqrt(x * x + y * y);
    }
}
