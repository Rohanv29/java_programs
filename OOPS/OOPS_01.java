package OOPS;

/**
 * OOPS_01
 */

// class Pen{
//     String color;
//     String type;//ball nor gel
//     public void write(){
//         System.out.println("writing something");
//     }
//     public void print(){
//         System.out.println(this.color);
//     }
// }
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name ,int age){
        this.name=name;
        this.age=age;
       
    }
    Student(){

    }
    //copy constructor
    Student(Student S){
        this.name=S.name;
        this.age=S.age;
    }
}
public class OOPS_01 {
    public static void main(String[] args) {
        // Pen pen1=new Pen();
        // pen1.color="blue";
        // pen1.type="gel";
        
        // Pen pen2=new Pen();
        // pen2.color="black";
        // pen2.type="ball";
        
        // pen1.print();
        // pen2.print();
        // Student s1=new Student();
        // s1.name="Rohan";
        // s1.age=18;
        // s1.printInfo();
        // Student s2=new Student();
        // s2.name="Ishan";
        // s2.age=20;
        // s2.printInfo();
        
        Student s1=new Student();
        s1.name="Aman";
        s1.age=23;

        Student s2=new Student(s1);
        s2.printInfo();
    }
    
}