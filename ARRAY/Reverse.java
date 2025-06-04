import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = obj.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the values of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }

        // Reverse the array
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[size - i - 1];
            arr[size - i - 1] = arr[i];
            arr[i] = temp;
        }

        // Display the reversed array
        System.out.print("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

