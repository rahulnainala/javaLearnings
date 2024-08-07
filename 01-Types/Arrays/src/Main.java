import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* Declaration of an Array
        * int[] variable_name = new int[sizeof_Array];
        */
        int[] numbers = new int[10];
        //by using index the user can access an array
        numbers[0] = 3;
        numbers[1] = 2;
        System.out.println(numbers);
        //Inbuilt Java Method of Arrays to display an Array.
        System.out.println(Arrays.toString(numbers));

        //If a user knows items beforehand, there is a new way of initialization.
        int [] newNumbers = {2,1,3,4,5};

        //To sort an Array, there is a function called .sort in Array class.
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));

        //Arrays in Java have fixed length.
        System.out.println(newNumbers.length);
        System.out.println("Hello world!");

    }
}