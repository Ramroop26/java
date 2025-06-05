public class desendingOrder {
      public static void main(String[] args) {
        int[] arr = {15,20,20,10};
        for(int i=0; i<4; i++){
            for(int j=i+1; j<4; j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<4; i++){
            System.out.print(arr[i] + "");
        }
        
    }

    
}
