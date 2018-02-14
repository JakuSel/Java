import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws InvalidIdExeptions{
        String rc;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your ID");
        rc=scanner.nextLine();

        String pattern="\\d{2}([05][1-9]|[16][0-2])[0-3][0-9]/?[0-9]{4}";
        Pattern r=Pattern.compile(pattern);
        Matcher m=r.matcher(rc);

        if (m.matches()){
            System.out.println("Correct form of ID");
        }else {
            //novy objekt triedy
            throw new InvalidIdExeptions(rc);
        }

    }

}
