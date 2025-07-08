//23 June 2025
// OOPS Starting

public class one {
    int a;   //Member Variable
    void set(int a) //Member Function
    {
        this.a=a; //(this) - This Operator represent instance variable of current class

    }
    void get()
    {
        System.out.println(a);
    }
    public static void main(String[] args) {
        one obj =  new one(); //Use always Current class name.
        obj.set(51);
        obj.get();
    }
    
}
