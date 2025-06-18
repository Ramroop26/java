 class SubSequence {
    static void SubSequence(String str1 , String str2){
        for(int i=0; i<str1.length(); i++){
            for(int j=0;j<str2.length(); j++){

            
            
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            
                
            }
            else if(j == str2.length()){
                System.out.println(str2 + " is a subsequence of " + str1 );
            }
           
        }
    }
}
    public static void main(String[] args){
        String str1 = "ABCDE";
        String str2 = "ABCD";
        SubSequence(str1,str2);

    }
    
}
