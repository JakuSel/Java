import java.util.Date;
import java.util.Random;

public class Main {

    public static void main (String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("Hello World!");
        Date currentDate = new Date();
        System.out.println(currentDate);
        Random randomEngine = new Random();
        int randomNumber = randomEngine.nextInt(5);
        System.out.println(randomNumber);

        person student = new person();
        student.SetName("Ivan");
        student.SetAge(24);

        person teacher = new person();
        teacher.SetName("Onofrej");
        teacher.SetAge(40);

        student.about();
        teacher.about();
        System.out.println("Teachers name: " + teacher.GetName());
        System.out.println("Student age: " + student.GetAge());
    }


}