public class assending {
    static int Assending(int [] arr){
    int size = arr.length;
    for(int i=0; i<size-1; i++){
        for(int j =i+1; j<size-i-1; j++){
            if(arr[i]>arr[j]){
            int temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
            }
        }

    }
    return 0;
    }
    public static void main(String[] args){
        int [] arr = {9,8,7,6,5,4,3,2,1};
    Assending(arr);

    
    for(int i: arr){
        System.out.print(i + " ");
    }
}
}
    

