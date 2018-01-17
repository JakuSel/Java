import java.awt.*;

public class person {
    private String name;
    private int age;
    private double salary;

    public void about() {
        System.out.println("Name: " + name + ", age: " + age);
    }

    //SETTER

    public void SetName(String meno) {
        name = meno;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    public String GetName() {
        return name;
    }

    public int GetAge() {
        return age;
    }

    private double salary(int type) {
        if (type = 1) {
            System.out.println("USD");
        } else if (type = 2) {
            System.out.println("Cz");
        } else if (type = 3) {
            System.out.println("EUR");
        }
    }
}
