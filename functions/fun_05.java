package functions;

public class fun_05 {
    // write a program in java tto show a use of try catch and finally block to show user defined text my error as arithmatic error
// wap in java to throw an user defined exception name "age exception " condition if age>=18 no exception age <=18 illegal age
   public static void main(String[] args) {
        try{
        int a=10;
        int b=0;
        int res =a/b;
        }
        catch(ArithmeticException e){
            System.out.println("My error");
        }
        finally{
            System.out.println("Executed");
        }
   }
   
}
