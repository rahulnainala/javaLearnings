//While loops
//Useful in situations where the user doesn't know how many times the loop needs to be run.

import java.util.Scanner;
//below code runs the loop till the user enters 'quit' in the terminal.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.print("Input :");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}