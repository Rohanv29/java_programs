package conditional;
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // for (int i = 0; i <=10; i++) {
        //     System.out.print(i+" ");
        // }
        // int i=0;
        // while (i<10) {
        //     System.out.print(i++ +" ");
        // }
        // int i=0;
        // do {
        //     System.out.println(i++);
            
        // } while (i<10);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
           
        }
         System.out.println("sum of "+ n+"natural number is: "+ sum);
        sc.close();
    }
    
}
