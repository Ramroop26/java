
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.print("Hello Rahil\n");

        Scanner obj = new Scanner(System.in);
        System.out.print("Give two numbers: ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println("Sum: " + (a + b));

        obj.close(); // Always a good practice
    }
}

class GFG {
    public static void main(String[] args) {
        char a = 'G';
        short s = 65;
        double d = 2.63546562;
        float f = 4.7884375f;
        long l = 8927343281561L;

        System.out.println("char: " + a);
        System.out.println("short: " + s);
        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
    }
}
