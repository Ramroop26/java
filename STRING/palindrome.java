 class palindrome {
static boolean  palindrom(String str)
{
int left=0;
int right=str.length()-1;
while(left<right)
{
if(str.charAt(right)!=str.charAt(left))
    {
        return false;
    }
 left++;
  right--;
}
 return  true;
}
public static void main(String[] args) {
        String str="naman";
if(palindrom(str))
{
    System.out.println("Pallindrome");
}
else
{
    System.out.println("Not Pallindrome");
}


    } 
}
