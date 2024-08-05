//we get the reference of Date from the below import package
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int age = 20;
        //since we must allocate memory for variable, we use 'new' keyword.
        Date now = new Date();

        //We can use the variable now to see its data and use its classes by the '.' operator
        System.out.println(now);

        System.out.println(now.getTime());
    }
}