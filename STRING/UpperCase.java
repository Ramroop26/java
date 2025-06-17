public class UpperCase{
    
    static void  UpperCase(String str) {
        char arr[] = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                arr[i] = (char)(ch + 32);  
            } else {
                arr[i] = ch;
            }
        }
        
        System.out.print(arr);
    }
    
    public static void main(String[] args) {
    UpperCase("TooPer");
    }
}
