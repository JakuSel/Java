package sk.akademiasovy.geometry;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    //obvod
    public double getPerimeter(){
        return a+b+c;
    }

    public double getArea(){
        double s=getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public boolean isRightTriangle(){

        if (a*a+b*b==c*c)
            return true;
        else if(a*a+c*c==b*b)
            return true;
        else if (b*b+c*c==a*a)
            return true;
        else
            return false;
    }
//du, zostrojenie trojuholníka
    //rovnostranný
    //rovnoramenny
    public boolean existTriangle(){
        if((a+b)>c)
            return true;
        else if((a+c)>b)
            return true;
        else if ((b+c)>a)
            return true;
        else
            return false;
    }
//rovnostranny trojuholník
    public boolean equilateralTriangle(){
        if (a==b && a==c)
            return true;
        else
            return false;
    }

//rovnoramenny trojuholník
    public boolean isoscelesTriangle(){
        if (a==b)
            return true;
        else if (a==c)
            return true;
        else if (b==c)
            return true;
        else
            return false;
    }



}
