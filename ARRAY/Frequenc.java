public class Frequenc {
    public static void main(String[] args) {
        int [] arr = {10,11,10,12,13,10};
        int size = arr.length;
        for(int i =0; i<size; i++){
            int count = 1;
            for (int j = i+1; j<size; j++) {
                if(arr[i]==arr[j] && arr[i]!= -1){
                    count++;
                    arr[j] = -1;

                }
                
            }
            if(arr[i]!=-1){
            System.out.println(arr[i] + " is " + count);
            }

        }
    }
    
}
