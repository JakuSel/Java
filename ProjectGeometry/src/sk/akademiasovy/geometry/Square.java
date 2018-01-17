package sk.akademiasovy.geometry;

public class Square {
    //udaje ktoré sa daju vypočítať sa neuchovávajú
    private double a;

    //getter- nastavuje premennu
    //setter- vracia premennu

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    //konštruktor, ktorý príjma hodnotu value
    public  Square(double value){
        a=value;
    }
    //konštruktor, ktory neprijma nič
    public Square(){
        a=0;
    }
    //ak nevytvoríme žiaden konštruktor, tak PC vytvorí konštruktor sam,
    // ak vytvoríme nejaky ktory niečo príjma, tak
    //samotny prazdny konštruktor sa nevytvorí

    //dalšie metody
    //metoda obsahu
    public double getArea(){
        return a*a;
    }
    //metoda obvodu
    public double getPerimeter(){
        return 4*a;
    }
    //metoda diagonaly
    public double getDiagonal(){
        return a*Math.sqrt(2);
    }

}
