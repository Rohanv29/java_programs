package arrays;

import java.util.*;


public class arrays_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[10];
        for(int i=0;i<10;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.print(marks[i]+" ");
        }
        sc.close();
    }
}
