public class DuplicateNumber {
    public static void main(String[] args) {
    int [] arr =  {1,2,3,5,5,6,7,7,9,1};
    int n = arr.length;
    for(int i=0; i<n; i++){
        Boolean Dup = false;
        for(int j=i+1; j<n; j++){
            if(arr[i] == arr[j] && arr[i] != -1){
                Dup = true;
                arr[j] = -1;

            }
        }
        if(Dup){
            System.out.println(arr[i]);
        }
    }

    }
    
}
