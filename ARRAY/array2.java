import java.util.Scanner;


public class array2 {
    public static void main(String[] args) {

        //Dynamic initialization 
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the value of the array:");
        for(int i=0; i<arr.length;++i){ //arr.length is property of array and arr.length() used C++ is method
            arr[i] = obj.nextInt();
        }
        for(int arr1:arr){// for Each loop
            System.out.println(arr1);
        }
    }
}