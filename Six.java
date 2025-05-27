
import java.util.Scanner;

public class Six{
    public static void main(String arr[]){

  
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter meter reading");
    int a=obj.nextInt();
  if(a>0 && a<=50)
      System.out.println(a*10);
      
else if(a>50 && a<=100){
    System.out.println(50*10+(a-50)*20);
}
else if(a>100 && a<=150){
    System.out.println(50*10+50*20+(a-100)*30);
}

else if( a>150 && a<=200){
    System.out.println(50*10+50*20+50*30+(a-150)*40);
}
else if(a>200 && a<=250){
    System.out.println(50*10+50*20+50*30+50*40+(a-200)*50);
}
    }
}