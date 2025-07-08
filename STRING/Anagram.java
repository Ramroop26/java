 class Anagram {

    static boolean ag(String Str, String str) 
    {
        if(Str.length()!=str.length())
        return false;
            int count[]= new int[26];

        for(int i=0;i<Str.length();i++)
        {
            count[Str.charAt(i)-'a']++;
            count[str.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)  return false;
        }
        return true;

    }
    public static void main(String[] args)
     {
        String Str = "anagram";
        String str = "ragnaam";

        if(ag(Str,str)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
    
}
