public class MissingElement {
    
    public static void main (String[] args) {
        int[] arr = {1,3,5,7,9};
        int size = arr.length;
        for(int i=0; i<size-1; i++){
            if(arr[i+1]-arr[i]>1){
                System.out.println("Missing element is:"+(arr[i]+1));
            }
        }

    }
}
