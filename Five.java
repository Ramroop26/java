
import java.util.Scanner;

public class Five{
    public static void main(String args[]){

     char input; 
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter your character");
     
     input=obj.next().charAt(0);

   if(input>='A' && input<='Z'){
     System.out.println("Upper Case");
   }
    else if (input>='a' && input<='z'){
        System.out.println("lower case");
    }
    else{
         System.out.println("special");
    }





    }
}