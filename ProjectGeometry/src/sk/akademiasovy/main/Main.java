package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;
import sk.akademiasovy.geometry.Triangle;

//trieda main
public class Main {
//metóda main, hlavna metoda
public static void main(String[] args) {
    //pri vytvaraní sme si importovali package s triedou square
    // datovy typ nazov premennej, tu je trieda ako datovy typ,
    // malym písmenom je premenna, square je premenna typu square
    //  musíme alokovať nove miesto v pamati pomocou new, pre tiredu square, vytvorí v ram novy objekt
    //prve square ako datovy typ, a druhe square je objekt
    Square kocka1=new Square(7.5);
    Square kocka2=new Square();

    //vypísať obsah štvroca
    System.out.println("Area of square 1 is: "+kocka1.getArea());
    //obvod
    System.out.println("Perimeter of square 1 is : "+kocka1.getPerimeter());
    //diagonála
    System.out.println("Diagonal of square 1 is : "+kocka1.getDiagonal());


    //obdĺžnik
    Rectangle obdlznik1=new Rectangle(8.5,6.9);
    Rectangle obdlznik2=new Rectangle();

    System.out.println("Area of rectangle 1 is : "+obdlznik1.getArea());
    System.out.println("Perimeter of rectangle 1 is : "+obdlznik1.getPerimeter());
    System.out.println("Diagonal of rectangle 1 is : "+obdlznik1.getDiagonal());

    Triangle trojuholník1=new Triangle(3,4,5);

    System.out.println("Perimeter of triangle 1 is : "+trojuholník1.getPerimeter());
    System.out.println("Area of triangle 1 is : "+trojuholník1.getArea());
    System.out.println(trojuholník1.isRightTriangle());

    System.out.println(trojuholník1.existTriangle());
    System.out.println(trojuholník1.equilateralTriangle());
    System.out.println(trojuholník1.isoscelesTriangle());

}
}
