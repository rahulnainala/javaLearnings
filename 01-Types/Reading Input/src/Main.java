import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //The below code is to work inside a terminal Window
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age :");
        //To get a byte use .next() to get the output
        byte age = scanner.nextByte();

        Scanner textHere = new Scanner(System.in);
        //Similarly
        System.out.print("Text Here :");
        String text = textHere.nextLine().trim();

        System.out.println("Text is " + text);
        System.out.println("you are " + age);
    }
}