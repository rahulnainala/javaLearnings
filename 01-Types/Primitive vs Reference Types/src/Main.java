import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Different Memory location of x and y
        byte x = 1;
        byte y = x;
        //x and y are independent since they are not pointing to the same memory.
        x=2;
        System.out.println(y);

        Point point1 = new Point(1,1);

        //the address of point 1 is allocated to point2.
        Point point2 = point1;
        // point2 stores the reference of the point object
        //point2 and point1 are referencing the same object (x:1,y:1)

        point1.x = 2;
        //we will see the point2 being updated here since its a reference value.
        System.out.println(point2);
    }
}