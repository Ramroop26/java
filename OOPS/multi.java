//inheritance - Multi level and Hierarchical

// Demonstration of Multilevel Inheritance
public class multi {
    public int a;
}

class second extends multi {
    public String b;
}

class third extends second {
    public static void main(String[] args) {
        third obj = new third();
        obj.a = 1;
        obj.b = "Ramroop";

        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}

