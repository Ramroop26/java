public class reverseArray {
   static int reverse(int arr[]){
    int n = arr.length;
    for(int i = 0; i<n-1; i++){
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
    }
    return 0;
   }
   public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    reverse(arr);
    for(int i: arr){
        System.out.println(i);
    }
   }
    
}
