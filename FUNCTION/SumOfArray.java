 
public class SumOfArray{
  
    static int Array(int arr[]){
      int sum = 0;
      int size = arr.length;
        for(int i=0; i<size; i++){
          sum+=arr[i];
            
        }
      
      return sum;
    }
      public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
      
       System.out.println("Sum of array is: "+  Array(arr));
    }

    
}

