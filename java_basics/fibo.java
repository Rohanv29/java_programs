package java_basics;

import java.util.*;

public class fibo {
    public static void main(String[] args) {

        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();

        int a = 0;
        int b = 1;

        if (k == 0) {
            System.out.println(a);
        }
        else if (k == 1) {
            System.out.println(b);
        }
        else {
            for (int i = 2; i <= k; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
    }
}