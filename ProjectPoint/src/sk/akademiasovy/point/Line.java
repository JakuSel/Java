package sk.akademiasovy.point;

public class Line {
    private Point a;    //začiatočny bod
    private Point b;    //koncovy bod

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    //konštruktor, ktory prijmi 4 čísla a z nich urobí 2 body

    public Line(int xa, int ya, int xb, int yb){
        //this ked nemusí byť nie je chyba
        a=new Point(xa,ya);
        this.b=new Point(xb,yb);
    }

    public double getLineLenght(){
        return a.getDistanceFromPoint(b);

    }

    public Point getMiddleOfLine(){
        return  new Point((a.getX()+b.getX())/2,(a.getY()+b.getY())/2);
    }

    public boolean isParallelToX(){
        if (a.getY()==b.getY())
            return true;
        else
            return false;
    }

    public boolean isParallelToY(){
        return a.getX()==b.getX();
    }



}
