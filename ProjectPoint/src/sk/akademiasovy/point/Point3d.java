package sk.akademiasovy.point;


import java.util.Random;

//príkaz na dedenia x a y extends a aku triedu chceme dediť
public class Point3d extends Point{

    private int z;

    public int getZ() {
        return z;
    }
    //konštruktor
    public Point3d(){
        z=0;
    }

    public Point3d(int x, int y, int z) {
        //vola sa ako prvé
        //vola rodiča a posiela mu dva parametrre
        //zavola triede point konštruktor, ktory prijima dve čísla
        super(x, y);
        this.z = z;
    }

    //prekriť getDistance, prepísať metodu
    @Override
    public double getDistance() {
        return Math.sqrt(getX()*getX()+getY()*getY()+z*z);
    }

    @Override
    public void generateRandomCoords() {
        //super znamena "moj rodič"
        Random random= new Random();
        this.z= random.nextInt(41)-20;
        //cez super zavolame povodnu metodu
        super.generateRandomCoords();
    }

   public double getDistanceFromPoint(Point3d other){
        return Math.sqrt(Math.pow((double)getX()-(double)other.getX(),2)+
                Math.pow((double)getY()-(double)other.getY(),2)+Math.pow((double)z-other.z,2));
   }

    @Override
    public void printPointInfo() {
        System.out.println("X: "+getX());
        System.out.println("Y: "+getY());
        System.out.println("Z: "+z);

    }
}
