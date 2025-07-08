 
 //Polymorphism - method overRiding. (By Interface)
 //Interface = Abstract - function - method overriding - using implement - an Abstract

 interface engine
 {
    void start();
 }

 class el implements engine
 {
    public void start()
    {
        System.out.println("Electric Engine Start");
    }
 }

 class pt implements engine
 {
    public void start()
    {
      System.out.println("Petrol Engine Start");
        
    }
 }

  class di implements engine
 {
    public void start()
    {
      System.out.println("Diesel Engine Start");
        
    }
 }
 

 
 class poli2 {
    public static void main(String[] args)
     {

      el obj = new el();
      obj.start();

      pt obj1 = new pt();
      obj1.start();

      di obj2 = new di();
      obj2.start();
        
    }
    
}
