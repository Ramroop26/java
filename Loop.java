


// public class Loop{
//     public static void main(String arr[]){

//     //   sum of first 10 natural number....... 
//       int sum=0;
//       for(int i=1;i<=10;i++){
//         sum=sum+i;
//       }

  

//   System.out.println(sum);

//     }

// }



//hcf questions and lcm questiones.........



// public class Loop{
//     public static void main(String arr[]){


//   int sum=1;
//     for(int i=1;i<=10;++i){
//         sum=sum*i;
      
//     }
// System.out.println(sum);

// }


// }




//   H.C.F.........

// public class Loop{
//     public static void main(String arr[]){
//         int a = 8;
//         int b = 6;
//         int max;
//         int result = 1;
//         max = (a > b) ? a : b; // Determine the larger of a and b

//         for (int i = 1; i <= max; i++) {
//             if (a % i == 0 && b % i == 0) {
//                 result = i; // Update result with the highest common factor found
//             }
//         }

//         System.out.println(result); // Output the GCD
//     }
// }

// HCf user input

// import java.util.Scanner;
// public class Loop{
//     public static void main(String arr[]){

//         Scanner obj=new Scanner (System.in);
//         System.out.println("Enter the first number");
//         int a=obj.nextInt();
//         System.out.println("Enter the second number ");
//         int b=obj.nextInt();
//         int max;
//         int result=1;
//         max=(a>b)?a:b;
//         for(int i=1;i<=max;i++){
//             if(a%i==0 && b%i==0){
//                 result=i;
//             }
//         }
//         System.out.println("The HCF of two given number is : "+result);
//     }
// }





import java.util.Scanner;

public class Loop{
    public static void main(String arr[]){

        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the first number");
        int a=obj.nextInt();
        System.out.println("Enter the second number ");
        int b=obj.nextInt();
       
        int result=1;
        int min = (a>b)?a:b;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){ 
                result=i;
            }
        }
        System.out.println("The LCM of two given number is : "+result);
    }
}