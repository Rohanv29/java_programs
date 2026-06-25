package arrays;

import java.util.*;

public class arrays_02 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int found=1;
        for(int i=0;i<n;i++){
            if(num[i]==x){
                System.out.println(x+" is found at index "+i);
                found=1;
                break;
            }
        }
        if(found!=1){
            System.out.println("Not found");
        }
        
        sc.close();
    }
    
}
