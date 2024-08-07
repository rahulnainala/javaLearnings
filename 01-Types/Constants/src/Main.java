public class Main {
    public static void main(String[] args) {

        //Constants never allow for changes of value
        final float Pi = 3.14F;
        Pi=1; //this is an error

        System.out.println(Pi);
    }
}