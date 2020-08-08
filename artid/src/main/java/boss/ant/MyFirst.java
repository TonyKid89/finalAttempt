package boss.ant;

public class MyFirst {
    public static void main(String[] args) {

        Point p1 = new Point(-1, 3);
        Point p2 = new Point(6, 2);
        Double fin= Point.distance(p1, p2);
        System.out.println(fin);
    }



}
