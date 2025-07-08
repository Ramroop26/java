
public class Palindrome{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5};
        boolean Palindrome=true;
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[n-i-1]){
                Palindrome = false;
                break;
        }
    }
    if(Palindrome){
        System.out.println("Palindrome");
       
        }
        else{

        
        System.out.println("Not Palindrome");
        }

    }
}
    


    


