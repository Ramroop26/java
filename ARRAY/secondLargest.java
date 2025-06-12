public class secondLargest {
    public static void main(String[] args) {
        int [] arr = {7,9,8,11,15};
        int max = arr[0];
        int secondmax = arr[0];
        int size = arr.length;
        for(int i=0; i<size; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max + "");
        for(int i=0; i<size; i++){
            if(arr[i]>max && arr[i]!=max){ 
                secondmax = arr[i];             

            }
        }
        System.out.println(secondmax + "");
    }
    
}
