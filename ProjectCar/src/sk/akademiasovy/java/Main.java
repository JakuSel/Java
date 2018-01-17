package sk.akademiasovy.java;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car("Skoda 120L",6.5f,"presov");
        car1.setBrand("Audi A8");
        car1.setGasConsumption(9.9f);
        car1.printInfo();
        car2.printInfo();
        car2.startEngine();
        car2.increaseSpeed();
        car2.printInfo();

        System.out.println("Naklady na cestu KE->PRG->KE:"+car1.getPrice(1600,1.33f));
        car1.startEngine();
        car1.increaseSpeed(50);
        car2.increaseSpeed(60);

        car1.printInfo();
        car2.printInfo();
 
        if (car1.getSpeed()>car2.getSpeed())
            System.out.println("Rychlejsie je: "+car1.getBrand());
        else if (car1.getSpeed()<car2.getSpeed())
            System.out.println("Rychlejšie je :"+car2.getBrand());
        else
            System.out.println("Idú rovnako rýchlo");


        /*car2 car3  premenna car3
        car2=car3  napojíme sa na car2
        nový car3*/
        Car car3=new Car("Tesla",6.9f,"kosice");

        car3.printInfo();

        Car taxi[]=new Car[10];

        for (int i=0;i<=9;i++)
            taxi[i]=new Car("Kia", 9.6f,  "Kosice" );


        for (int i=0;i<=9;i++){

            System.out.println(taxi[i]);
        }

        for (int i=0;i<=9;i++) taxi[i].startEngine();

        int i,u;

        for (int i=0;i<=9;i++)
        {
            if (taxi[i].generatePlate().contains("8"))
                System.out.println(taxi[i].generatePlate());
        }

        Random ran=new Random();
        for (int i=0;i<=9;i++){
            taxi[i].increaseSpeed(ran.nextInt(31)+40);
        }


        for (int i=0;i<=9;i++)
            System.out.println("vypis rychlosti"+taxi[i].getSpeed());

        float max;
        max=taxi[0].getSpeed();
        int u = 0;
        for (int i=0;i<=9;i++) {
            if (max < taxi[i].getSpeed()){

                max=taxi[i].getSpeed();
                u=i;
            }}
        System.out.println("best"+taxi[u].generatePlate());
        System.out.println("best"+taxi[u].getSpeed());



        int p=taxi.length;
        float pr;
        float sum=0.0f;
        for (int i=0;i<p;i++)
            sum=sum+taxi[i].getSpeed();

        pr=sum/p;

        System.out.println("priemerna rychlost"+pr);

        int number=ran.nextInt(taxi.length);
        System.out.println("zavola taxik"+taxi[number].generatePlate());

    }
}
