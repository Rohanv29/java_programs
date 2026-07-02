package OOPS;
abstract class  Animal{
   abstract void walk();

   //Animal  ek hamara blue print h ye ek imagination h
   Animal(){
    System.out.println("you are creating an new animal");
   } 
   public void eat(){
    System.out.println("Animal eats");
   }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class OOPS_05 {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
    }
}
