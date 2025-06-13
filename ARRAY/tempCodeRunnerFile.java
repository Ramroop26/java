public class countOfFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3,6};
    
        for(int i=0; i<6; i++){
            int count = 1;
            if(arr[i]!= -1){
                

                for(int j =i+1; j<6; j++){
                    if(arr[i]==arr[j]){