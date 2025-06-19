 class SubSequence {
    static boolean  SubSequence(String str1 , String str2){
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                j++;

            }
            i++;

        }
        return j == str2.length();
    }
    public static void main(String[] args){
        String str1 = "ABCDE";
        String str2 = "ABCD";
        if(SubSequence(str1,str2)){
            System.out.println("Subsequence");
        }
        else{
            System.out.println("Not a Subsequence");
        }

    }
    
}
