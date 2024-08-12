import java.util.Scanner;
//Do-While loops (gets executed atleast once)
public class Main {
    public static void main(String[] args) {
        int count = 1;

        // Do-while loop
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 5);

        System.out.println("Loop ended. Final count is: " + count);
    }
}