//Encaptulation & Abstraction.
//Encaptulation - Data binding (member variable value to asign through member function)
//Abstraction - They provides PRIVACY and showing naccessory data(Value) and hiding Unneccessory data (variable).

public class Encap
 {
    int a;
    String b;

    void bind(int a, String b)
    {
        this.a=a;
        this.b=b;
    }
    void Display()
    {
        System.out.println(a + "" +b);
    }

    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.bind(20, "Ramroop");

        obj.Display();
    }
}
