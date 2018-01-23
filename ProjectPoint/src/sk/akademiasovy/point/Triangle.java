package sk.akademiasovy.point;
//implementovane metody z triedy interface, pomocou implements InterfaceTriangle
public class Triangle implements InterfaceTriangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle (int xa, int ya, int xb, int yb, int xc, int yc){
        this.a=new Point(xa,ya);
        this.b=new Point(xb,yb);
        this.c=new Point(xc,yc);
    }

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
//implementovane funkcie
    //rovnostranny
    @Override
    public boolean isEquilateral() {
        if (getSideA()==getSideB() && getSideB()==getSideC()) {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean isRightAngle() {
        if (getSideA()*getSideA()+getSideB()*getSideB()==getSideC()*getSideC())
            return true;
        else if(getSideA()*getSideA()+getSideC()*getSideC()==getSideB()*getSideB())
            return true;
        else if (getSideB()*getSideB()+getSideC()*getSideC()==getSideA()*getSideA())
            return true;
        else
            return false;
    }

    @Override
    public boolean isIsosceles() {
        if (getSideA()==getSideB())
            return true;
        else if (getSideA()==getSideC())
            return true;
        else if (getSideB()==getSideC())
            return true;
        else
            return false;
    }
}