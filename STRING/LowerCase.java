//LoweCase convert UpperCase 
 public class LowerCase{
    
    static void LowerCase(String str) {
        char arr[] = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[i] = (char)(ch - 32); 
            } else {
                arr[i] = ch; 
            }
        }
        
        System.out.println(arr);
    }
    
    public static void main(String[] args) {
     LowerCase("ramroop"); 
    }
}
