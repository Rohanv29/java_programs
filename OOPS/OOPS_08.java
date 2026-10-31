package OOPS;
class Mango{
    int m,n,o;
}
class Orange extends Mango{
    void Sum(){
        System.out.println(m+n+o);
    }
}
public class OOPS_08 {
    public static void main(String[] args) {
        Orange or=new Orange();
        or.m=10;
        or.n=20;
        or.o=30;
        or.Sum();
    }
}
