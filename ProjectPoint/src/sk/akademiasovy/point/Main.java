package sk.akademiasovy.point;

public class Main {
    public static void main(String[] args) {
        //novy bod
        Point p1=new Point(2,2);
        System.out.println("Point p1 is in "+p1.getQuadrant()+" quadrant");

        Point p2=new Point();
        p2.generateRandomCoords();
        System.out.println("Point p2 is in "+p2.getQuadrant()+" quadrant");
        System.out.println("Distance is:"+p2.getDistance());

        p1.printPointInfo();
        p2.printPointInfo();
        System.out.println("Distance between p1 and p2 is : "+p1.getDistanceFromPoint(p2));

    }
}
