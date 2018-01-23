package sk.akademiasovy.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    public void Tdate(){
        Date datum=new Date();
        System.out.println(datum);
    }

    public void DDMMYY(){
        Date date=new Date();
        SimpleDateFormat datum=new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        System.out.println(datum.format(date));

    }

}
