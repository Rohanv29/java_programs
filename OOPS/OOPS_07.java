package OOPS;

class A{
    int a;
    void Show_me(){
        System.out.println("Printed from A "+ a);
    }
}

class B extends  A{
    int b;
    void Show_me2(){
        System.out.println("Printed from B "+ b);
    }
    void Show_me_all(){
        System.out.println("Printed from B"+"The values"+a+" "+b);
    }
}
public class OOPS_07 {
    public static void main(String[] args) {
        A ax=new A();
        B bx=new B();
        ax.a=10;
        bx.b=10;
        // ax.b=10;
        bx.b=30;
        bx.Show_me();
        bx.Show_me2();
        bx.Show_me_all();
    }
}
