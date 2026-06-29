package OOPS;
// class Shape{
//     String color;
// }
// class Triangle extends Shape{

// }
// import java.util.*;
class Shape{
    public void area(){
        System.out.println("Displays Area");
    }
}
class Triangle extends Shape{
    public static void area(int l,int h) {
        System.out.println(1/2*l*h);        
    }
}
class EquilateralTriangle extends Triangle{
    public static void area(int l,int h) {
        System.out.println(1/2*l*h);        
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class OOPS_03 {
    // public static void main(String[] args) {
    //     Triangle t1=new Triangle();
    //     t1.color="red";
    // }
    
}
