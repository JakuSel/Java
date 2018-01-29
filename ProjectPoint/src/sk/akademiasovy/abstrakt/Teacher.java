package sk.akademiasovy.abstrakt;

public class Teacher extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void info() {
        System.out.println("Im Teacher");
    }
}
