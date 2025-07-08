//Polymorphism =  Method Overiding. (by class, Object)
 class Animal {
    void  sound()
    {
        System.out.println("Animal Sound");
    }
    
}

class cat extends  Animal
{
    void sound()
    {
        System.out.println("cat Sound");
    }
}

class dog extends  Animal
{
    void  sound()
    {
        System.out.println("dog Sound");
    }
}

class poli1
{
    public static void main(String[] args) {

        //By Class (OverRiding):-
        //Animal obj = new cat();
        //obj.sound();
        //Animal obj  = new dog();
        //obj.sound();

        //By Object (OverRiding):- one class with two overRide Objects

        //They are 3 types of method overRiding :-
        //By class, By object, By Interface.

        Animal obj;
        obj = new cat();
        obj.sound();

        obj = new dog();
        obj.sound();
    }
    
}