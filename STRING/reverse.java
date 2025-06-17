 class reverse {
    static void  reverse(String str)
{
char arr[] = new char [str.length()];
for (int i = 0; i <str.length(); ++i) {
    arr[i] = str.charAt(i);
    
}

int right = str.length()-1;
int left = 0;

while(left<right)
{
      char  temp  = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        right--;
        left++;
}
for(char i: arr){
    System.out.println(i);
}
}
    public static void main(String[] args) {
        String str = "zyxwvu";
        reverse(str);
        

    }
    
}
