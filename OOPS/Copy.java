//Copy Constructor -  Shallow / Deep.

public class Copy 
{

int b[];
Copy(int b[])
{
    this.b=b;
}
Copy(Copy obj1)  // Deep Copy Constructor make new memory.
{
    this.b = new int[obj1.b.length];
    this.b[0] = obj1.b[0];
}
public static void main(String[] args) {
    int b[]={10};
    Copy obj1 = new Copy(b);
    Copy obj2 = new Copy(obj1);

    System.out.println(obj1.b[0]);
    System.out.println(obj2.b[0]);

    obj1.b[0] = 20;

    System.out.println(obj1.b[0]);
    System.out.println(obj2.b[0]);
}
    
}
