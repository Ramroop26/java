 
 //Inharitance - Single Level
 class inhari 
{
    public int a;
    public String b;

    
}

class Se extends  inhari
{
    public static void main(String[] args) 
    {
        Se obj = new Se();
        obj.a=1;
        obj.b="Ramroop";
        System.out.println(obj.a +"" +obj.b);
    }
}
