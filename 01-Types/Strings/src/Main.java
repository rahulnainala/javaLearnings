public class Main {
    public static void main(String[] args) {
        //The correct way is the below one
        //String message = new String("Hello World");
        //but the below one is a simpler method to do so
        String message = "Hello World" + "!";
        System.out.println(message);

        // The above message is a reference type, we can use the methods
        /*
         * message.length() => gives no. of characters
         * message.toUpperCase() => makes all the chars Uppercase
         * message.contains() => checks if we have the text
         * message.replace(target,replacement) => replaces the targeted value with the replacement
         * */
    }
}