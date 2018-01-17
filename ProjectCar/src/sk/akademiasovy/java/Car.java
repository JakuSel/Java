package sk.akademiasovy.java;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private boolean engine;
    private float gasConsumption;
    private boolean frontWipper;
    private String plate;

    //konštruktor surovy
    public Car(){
        speed=0;
        engine=false;
        gasConsumption=7.9f;
        brand=null;
        frontWipper=false;
        generatePlate(null);
    }
    //konštruktor s danými vlastnosťami
    public Car(String brand, float gasConsumption, String city){
        speed=0;
        engine=false;
        this.brand=brand;
        this.gasConsumption=gasConsumption;
        frontWipper=false;
        generatePlate(city);
    }

    public void setBrand(String value){
        brand=value;
    }

    public void setGasConsumption(float gasConsumption){
        this.gasConsumption=gasConsumption;
    }

    public void printInfo(){
        System.out.println("Brand:"+this.brand+" "+"Spotreba:"+gasConsumption+" "+"Speed:"+speed);
    }

    public void startEngine(){
        engine=true;
    }

    public void stopEngine(){
        engine=false;
    }

    public void increaseSpeed(){
        if(engine==true)
        speed=speed+10;
    }

    public void decreaseSpeed(){
        speed=speed-10;
        if (speed==0)
        speed=0;
    }

    public void stop(){
        speed=0;
    }

    public float getPrice(int distance, float costPerLiter){
        float price;
        price= distance*gasConsumption*costPerLiter/100;
        return price;
    }

    public void increaseSpeed(int speed){
        if(engine==true && speed>0)
            this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    } 

    public String getBrand() {
        return brand;
    }

    public void toggleWipper(){
        if (frontWipper==false)
            frontWipper=true;
        else
            frontWipper=true;
    }

    public void generatePlate(String city){
        if (city==null)
            city="";
        switch (city.toLowerCase().trim()){
            case "trencin":plate="TN-"; break;
            case "presov":plate="PO-"; break;
            case "bratislava":plate="BL-"; break;
            case "poprad":plate="PP-"; break;
            case "senec":plate="SC-"; break;
            default: plate="KE-";
        }

        Random random=new Random();
        int i;
        for (i=0;i<3;i++){
            int randomNumber=random.nextInt(10);
                    plate=plate+randomNumber;
        }
        for (i=0;i<2;i++){
            int randomNumber=random.nextInt(26)+'A';
            plate=plate+(char)randomNumber;
        }
        System.out.println("SPZ:"+plate);
    }


}
