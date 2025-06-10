public class countOfFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3,6};
        for(int i=0; i<6; i++){
            if(arr[i]!= 0){
                int count = 1;

                for(int j =i+1; j<6; j++){
                    if(arr[i]==arr[j]){
                        arr[j] = 0;
                        count++;
                }

            }
        }
        System.out.print(arr[i] + " " ); 
    }
}
}
