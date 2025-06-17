// public class ArrayCommaSeparator{
//     static int Array(int  arr[]){
//           int size = arr.length;

//         for (int i = 0; i <size; i++) {

//             System.out.print(arr[i]);

//             if (i <size-1) {
//                 System.out.print(", ");
//             }
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         Array(arr);
     
//     }
// }

// 2_9 4_3 8_7

public class ArrayCommaSeparator{
    static int Array(int  arr[]){
          int size = arr.length;

        for (int i = 0; i <size; i++) {

            System.out.print(arr[i]);

            if (i%2==0) {
                System.out.print( "_");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Array(arr);
     
    }
}
