import java.util.Scanner;

public class SmallestType {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        double input = keyboard.nextDouble();
        if (input < Byte.MAX_VALUE && input > Byte.MIN_VALUE) {
            System.out.println(Byte.TYPE);
        } else if (input < Integer.MAX_VALUE && input > Integer.MIN_VALUE) {
            System.out.println(Integer.TYPE);
        } else if (input < Long.MAX_VALUE && input > Long.MIN_VALUE) {
            System.out.println(Long.TYPE);
        } else {
            System.out.println(Double.TYPE);
        }
    }
}
