import java.util.*;
///sum of array
public class array3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = obj.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the values of the array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();  // Corrected to arr[i]
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
