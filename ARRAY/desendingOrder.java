public class desendingOrder {
      public static void main(String[] args) {
        int[] arr = {6,4,7,8,9,1};
        for(int i=0; i<6; i++){
            for(int j=i+1; j<6; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<6; i++){
            System.out.print(arr[i] + "");
        }
        
    }

    
}
