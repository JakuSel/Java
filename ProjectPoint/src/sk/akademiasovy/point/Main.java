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

        Point3d p3=new Point3d(2,2,2);
        Point3d p4=new Point3d();
        p4.generateRandomCoords();
        System.out.println();
        p3.printPointInfo();
        System.out.println();
        p4.printPointInfo();
        System.out.println();
        System.out.println("Distance between p3 and p4 is :"+ p3.getDistanceFromPoint(p4));

    }
}
