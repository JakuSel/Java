package sk.akademiasovy.other;

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
        if (!mail.contains("@")){
            return false;
        }
        else if (mail.length()<=5) {
            return false;
        }
        else{



        }

    }

}
