public  class movezero{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 1,2};
        int j=0;
        int size = arr.length;
        for(int i=0; i<size; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

        }

}
for(int i=j; i<size; i++){
    arr[i]=0;
    
}
for(int i:arr){
System.out.println(i);
}
    }
}