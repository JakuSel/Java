package sk.akademiasovy.point;

import java.util.Random;

public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point (){
        //novy sposob, tento konštruktor zavola predošly konštruktor a ten nastavíme na 0
        //this - volame konštruktor tej triedy, kde posielame dve čísla
        //this musí byť prvy príkaz v konštruktore; prva vec čo sa spúšťa, musíme urobiť základné nastavenie
        this (0,0);
    //    x=0;
        y=0;
    }
    //metódy
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getQuadrant(){
     /*  2 | 1
        ___|___
           |
        3  |  4
     */
        if (x>0 && y>0)
            return 1;
        else if (x<0 && y>0)
            return 2;
        else if (x<0 && y<0)
            return 3;
        else if (x>0 && y<0)
            return 4;
        else
            return 0;
    }

    public void generateRandomCoords(){
        Random random=new Random();
        //generovanie od -20 do +20, tam je 41 čísel
        this.x=random.nextInt(41)-20;
        this.y=random.nextInt(41)-20;

    }

    public double getDistance(){
        return Math.sqrt(x*x+y*y);
    }

    public void printPointInfo(){
        System.out.println("X: "+getX());
        System.out.println("Y: "+getY());
        System.out.println("Quadrant: "+getQuadrant());
        System.out.println("Distance: "+getDistance());
    }

    public double getDistanceFromPoint(Point other){
        return Math.sqrt(Math.pow((double)x-(double)other.getX(),2)+Math.pow((double)y-(double)other.getY(),2));
    }


}


