/*
The for-each loop (also known as the enhanced for loop)
is used to iterate over arrays or collections
without needing to manage the index manually.
 */

public class Main {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // For-each loop to iterate over the array
        for (int number : numbers) {
            System.out.println("Number is: " + number);
        }

        System.out.println("Loop ended.");
    }
}