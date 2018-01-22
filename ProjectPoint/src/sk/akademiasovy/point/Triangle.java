package sk.akademiasovy.point;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

  /*  public Triangle (int xa, int ya, int xb, int yb, int xc, int yc){
        this.a=new Point(xa,ya);
        this.b=new Point(xb,yb);
        this.c=new Point(xc,yc);
    }
*/
    public double getSideA(){
        return b.getDistanceFromPoint(c);
    }

    public double getSideB(){
        return a.getDistanceFromPoint(c);
    }

    public double getSideC(){
        return a.getDistanceFromPoint(b);
    }

    public double getPerimeter(){
        return getSideA()+getSideB()+getSideC();

    }

    public double getArea(){
        double s=getPerimeter();
        return Math.sqrt(s*(s-getSideA())*(s-getSideB())*(s-getSideC()));

    }
}