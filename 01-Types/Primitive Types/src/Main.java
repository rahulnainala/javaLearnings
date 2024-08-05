public class Main {
    public static void main(String[] args) {
        //Byte - 1 Bytes(Memory)
        byte age = 30;
        //Integers - 4 Bytes(Memory)
        //the _ is similar to ',' => for readability
        int viewsCount = 123_456_780;
        /*
        Long - 8 Bytes(Memory)
        the viewsHighest will give an error since java will interpret it as int,
        the user must need to explicitly define it as long by appending a suffix with 'L' or 'l'.
        */
        long viewsHighest = 3_342_343_323L;

        /*
        For decimal values,
        the user must have to explicitly define float values with a suffix of 'F' or 'f'.
        */
        //Float - 4 Bytes(Memory)
        float price = 10.99f;

        //Double - 8 Bytes(Memory)
        double priceFloatValue = 10.23232323;

        //Char - 2 Bytes (Memory)
        char letter = 'A';

        //Boolean - 1 Byte(Memory)
        //Either a true or false value
        boolean isEligible = false;
        System.out.println(viewsCount);
    }
}