public class two {
    int a;
    two()
    {
        System.out.println("DF:- " +a);
    }
    two(int a)
    {
        this.a=a;
        System.out.println("OL Parameterized :- " +this.a);
    }
    two(two obj1)
    {
        this.a=obj1.a;
        System.out.println("Copy :- " +this.a);
    }
    public static void main(String[] args) {
        two obj = new two();  //Default
        two obj1 = new two(1); //Overloaded
        two objc = new two(obj1);  //Copy
    }
    
}
