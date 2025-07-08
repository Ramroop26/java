//Polymorphism - Method Overloading
//Many foam of Polymorphism : -
//function (Method Overloading),
//Objects (Method Overriding).

public class poli {
    //Function Overloading.
    void sum()
    {
        System.out.println("sum 1");
    }

    void sum(int a)
    {
        System.out.println("sum" +a);
    }

    public static void main(String[] args) {
        poli obj = new poli();
        obj.sum();
        obj.sum(2);

    }
}
