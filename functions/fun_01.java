package functions;


import java.util.Scanner;

public class fun_01 {
    public static int add2num(int a,int b) {
        // System.out.println("sum of"+a+" and "+b+" is :"+ (a+b));
        return a+b;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt(),b=sc.nextInt();
      System.out.println( add2num(a, b));
      sc.close(); 
    }
}
