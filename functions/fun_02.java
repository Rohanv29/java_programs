package functions;

import java.util.*;

public class fun_02 {
    public static int Average(int n1,int n2,int n3){
        return (n1+n2+n3)/3;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Average(a,b,c));
        sc.close();
    }

}
