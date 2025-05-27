//----------------------------------------------------------RIGHT TRINGLE------------------------------------------------//
// public class pattern{
//     public static void main(String[] args){
//         for(int r=1;r<=5;r++){
//             for(int c=1;c<=5;c++){
//                 if(c<=r){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }

  // ---------------------------------------------------------------LEFT TRINGLE----------------------------------------------//
// public class pattern{
//     public static void main(String[] args){
//         //inverse left angel tringle
//         for(int r=1;r<=5;r++){
//             for(int c=1;c<=5;c++){
//                 if(c>=6-r){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }

// -----------------------------------------------------------INVERSE RIGHT ANGEL TRINGAL----------------------------------------//
// public class pattern{
//     public static void main(String[] args){
//         for(int r=1;r<=5;r++){
//             for(int c=1;c<=5;c++){
//                 if(c<=6-r){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }

//----------------------------------------------------------------- INVERSE LEFT ANGEL TRINGAL------------------------------------------//
// public class pattern{
//     public static void main(String[] args){
//         for(int r=1;r<=5;r++){
//             for(int c=1;c<=5;c++){
//                 if(c>=r){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }

// -----------------------------------------------------------------PYRAMID TRINGAL--------------------------------------------// 
// public class pattern{
//     public static void main(String[] args){
//         //inverse left angel tringle
//         for(int r=1;r<=5;r++){
//             for(int c=1;c<=9;c++){
//                 if(c>=6-r && c<=4+r){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }

//------------------------------------------------------PYRAMID LEFT RIGHT TRINGLE-------------------------------------------------//
// public class pattern{
//     public static void main(String[] args){
       
//         for(int r=1;r<=5;r++){
//             for(int c=1;c<=9;c++){
//                 if(c>=r && c<=10-r){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }

//---------------------------------------------------------------DIAMOND TRINGLE-------------------------------------------------------//

// public class pattern{
//     public static void main(String[] args){
//         int a=0;
       
//         for(int r=1;r<=9;r++){
//             a=(r<=5)?++a:--a;
//             for(int c=1;c<=9;c++){
//                 if(c>=6-a && c<=4+a){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }
//-----------------------------------------------RIGHT NUMBER PRINT PATTERN---------------------------------------------------------------//

// public class pattern{
//     public static void main(String[] args){

//         for(int r=1;r<=5;r++){
           
//             for(int c=1;c<=5;c++){
//                 if(c<=r){
//                     // System.out.print(r);
//                     System.out.print(c);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }

//--------------------------------------------------------------LEFT NUMBER PRINT PATTERN

// public class pattern{
//     public static void main(String[] args){

//         for(int r=1;r<=5;r++){
           
//             for(int c=1;c<=5;c++){
//                 if(c>=6-r){
//                     System.out.print(r);
//                     // System.out.print(c);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }

//--------------------------------------------------------------INVERSE RIGHT NUMBER PRINT PATTERN-----------------------------------------------//

// public class pattern{
//     public static void main(String[] args){

//         for(int r=1;r<=5;r++){
           
//             for(int c=1;c<=5;c++){
//                 if(c<=6-r){
//                     System.out.print(r);
//                     // System.out.print(c);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }

//--------------------------------------------------------------INVERSE LEFT NUMBER PRINT PATTERN-----------------------------------------------//

// public class pattern{
//     public static void main(String[] args){

//         for(int r=1;r<=5;r++){
           
//             for(int c=1;c<=5;c++){
//                 if(c>=r){
//                     System.out.print(r);
//                     // System.out.print(c);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }

//--------------------------------------------------------------STAR NUMBER PRINT PATTERN-----------------------------------------------//

// public class pattern{
//     public static void main(String[] args){

//         for(int r=1;r<=5;r++){
           
//             for(int c=1;c<=9;c++){
//                 if(c>=6-r && c<=4+r){
//                     System.out.print(r);
//                     // System.out.print(c);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }


//     }
// }
//----------------------------------------------------------------------- RIGHT CHAR A,B,C,D PRINT PATTERN---------------------------------//
public class Pattern{
    public static void main(String[] args){
        for(int r=1;r<=5;r++){
           
            for(int c=1;c<=5;c++){
                if(c<=r){
                    // System.out.print((char)(r+96));
                    System.out.print((char)(r+64));
                    // System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


   }
}