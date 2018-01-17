package sk.akademiasovy.geometry;

public class Rectangle {
    //strany a,b
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double value){
        this.a=value;
        this.b=value;
    }

    public Rectangle(){
        a=0;
        b=0;
    }

    //metody
    public double getArea(){
        return a*b;
    }

    public double getPerimeter(){
        return 2*(a+b);
    }

    public double getDiagonal(){
        double diagonal=Math.sqrt(a*a+b*b);
        return diagonal;
    }
    //transponovany obdlžnik
    public void transpose(){
        double temp;
        temp=a;
        a=b;
        b=temp;
    }
}
