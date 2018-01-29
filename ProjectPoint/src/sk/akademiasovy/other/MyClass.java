package sk.akademiasovy.other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
    public String formatName(String name){
        if (name == null || name.length() == 0) {
            return name;
        }
        else {
            return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        }
    }

   public boolean isEmailValid(String mail){
        if (!mail.contains("@") || mail.length()<=5){
            return false;
        }
//regulerny výraz
       //vytvoríme inštanciu pattern a pridame mu regulerny vyraz
        Pattern p=Pattern.compile("[\\w\\d\\s]{3,}+@{1,1}?[a-zA-Z0-9.-]+\\.[\\w]{2,4}");
        //vytvoríme matcher, ktory zavola matcher, ktory je objektu pattern a pridame vyraz
        Matcher m=p.matcher(mail);

        if (m.find()){
            return true;
        }
        else{
            return false;
        }
    }
//Rodne číslo school
    /*
    public Gender getGender(String nim){
        char z=nim.charAt(2);
     if (nim.charAt(6)=='/' && nim.length()!=11 )
         return Gender.ERROR;
     else if (nim.charAt(6)!='/' && nim.length()!=10)
         return Gender.ERROR;
     else {
         if (z == 0 || z == 1)
             return Gender.MALE;
         else if (z == 5 || z == 6)
             return Gender.FEMALE;
         else
             return Gender.ERROR;
     }
    }
*/
    public Gender getGenderReg(String nim){
        Pattern p=Pattern.compile("[\\d]{6,}+\\/[\\d]{4,}");
        Matcher m=p.matcher(nim);

        if (m.find()){
            char z=nim.charAt(2);

            if (z == '0' || z == '1')
                return Gender.MALE;
            else if (z == '5' || z == '6')
                return Gender.FEMALE;
            else
                return Gender.ERROR;
        }


        else{
            return Gender.ERROR;
        }
    }



}
