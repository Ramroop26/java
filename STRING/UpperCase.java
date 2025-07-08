public class UpperCase{
    
    static void  UpperCase(String str) {
        char arr[] = str.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);  
            }
        }
        
        System.out.print(arr);
    }
    
    public static void main(String[] args) {
    UpperCase("TooPer");
    }
}
