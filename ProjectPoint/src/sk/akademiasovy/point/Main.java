package sk.akademiasovy.point;

import sk.akademiasovy.date.MyDate;
import sk.akademiasovy.other.MyClass;

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


    //vytvoríme usečku a vytvoríme suradnice

        Point point5=new Point(2,5);
        // prvy- vytvoríme a pošleme a druhy new point nema meno a trieda main s tym pracovať nemože,
        // len trieda line, ktora to uloží do premennej b
        Line line1=new Line(point5,new Point(10,4));

        Line line2=new Line(1,3,4,6);

        System.out.println("Line 1 lenght is: "+line1.getLineLenght());
        //get middle point of line wrati point, a musime printnuť metodu
        System.out.println("Middle of line 2 is:");
        line2.getMiddleOfLine().printPointInfo();



        Point pointA=new Point(3,3);
        Point pointB=new Point(4,4);
        Point pointC=new Point(5,5);
        Triangle trojuholník1=new Triangle(pointA,pointB,pointC);
        System.out.println("Perimeter is:"+trojuholník1.getPerimeter());
        System.out.println("Area is:"+trojuholník1.getArea());

        //trojuholníky
        Triangle rovnoramenny=new Triangle(3,3,4,7,5,3);
        Triangle pravouhly=new Triangle(7,7,20,7,20,2);
        Triangle rovnostranny=new Triangle(0,0,1,0,0,1);

    //implementacia interface s triedov triangle
        System.out.println("is equilateral "+rovnostranny.isEquilateral());
        System.out.println(rovnostranny.getSideA()+" "+rovnostranny.getSideB()+" "+rovnostranny.getSideC());
        System.out.println("Is isosceles "+rovnoramenny.isIsosceles());
        System.out.println("Is right angled "+pravouhly.isRightAngle());

    //datum
        //novy objekt typu class MyDate
        MyDate today=new MyDate();
        today.DDMMYY();


    //string, v mene prve písmeno velke, zvyšne male
        MyClass name=new MyClass();
        System.out.println(name.formatName("jANKO"));


    }
}
