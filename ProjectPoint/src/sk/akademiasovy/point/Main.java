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

        //polymorf
        Object o1=new Point();
        Point p5=new Point3d(3,4,5);
        //pretypujeme pint na 3d
        System.out.println("Distance pretipovanej premennej:  "+((Point3d)p5).getDistance());

        //pretypovanie


        //dieťo nemože vytvarať objekt rodiča
      //  Point3d p34=new Point();


        //premenna typu rozhranie
        Geometry g1=new Point3d(5,-9,6);
        //pretipujem g1 a tym sme dokazali zavloať metodu v point
        //pred premennu píšem na čo chcem pretypovať
        ((Point3d)g1).printPointInfo();

        //generovanie pola 10 pointov s random číslami
        Point3d arrPoints[]=new Point3d[10];

        for (int i=0;i<10;i++){
            arrPoints[i]=new Point3d();
            arrPoints[i].generateRandomCoords();
            arrPoints[i].printPointInfo();
            System.out.println();
        }






    }
}
