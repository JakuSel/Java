package sk.akademiasovy.abstrakt;


//chceme aby trieda bola abstraktna, pridame pred "class" "abstract"
public abstract class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //abstraktna metoda
    public abstract void info();

}
