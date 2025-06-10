public class secondLargestnumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i =0; i<2; i++){
            for(int j=i+1; j<5; j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[1]);
    }
    
}
