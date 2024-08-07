//Sample Code to see IfStatements in Use.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temp :");
        byte temp = scanner.nextByte();
    if( temp > 30) {
        System.out.println("Its a hot day");
        System.out.println("Drink Water");
    }
    else if (temp > 20) {
    System.out.println("Beautiful Day");
    }
    else System.out.println("Its Cold");
    }
}