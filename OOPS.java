public class OOPS {
    public static void main(String args[]){
     
     dog f1 = new dog();
      f1.eats();
      f1.barks();
      f1.walks();  
    }
    
}
//parent class
class Animal{
   int legs;
   String color;

   void eats(){
      System.out.println("eats f");
   }
   void runs(){
      System.out.println("runs");
   }
}
//subclass 
class mammals extends Animal{
   int legs;

   void walks(){
      System.out.println("walks");
   }
}
class birds extends Animal{
   int legs;

   void fly(){
      System.out.println("fly");
   }
}
class dog extends mammals{
   String color;
   void barks(){
      System.out.println("dog barks");
   }
}
class peakok extends birds{
   int legs;

   void fly(){
      System.out.println("fly");
   }
}


