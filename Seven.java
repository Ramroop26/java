import java.util.Scanner;

public class Seven{
    public static void main(String args[]){

System.out.println("Enter the marks of subjects");
Scanner obj=new  Scanner (System.in);
int Hindi=obj.nextInt();
int English=obj.nextInt();
int Maths=obj.nextInt();
System.out.println("Hindi"+"English"+"Maths");

int percentage=(Hindi+English+Maths)/3;
System.out.println(percentage);


if((percentage>=40 && Hindi<40 && English<40 && Maths<40))
{
    if(percentage>=40 || percentage<60){
        System.out.println("Grade c");
    }
    else if(percentage>=60 || percentage<80){
        System.out.println("Grade B");
    }

}

    }




}