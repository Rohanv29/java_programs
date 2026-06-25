package functions;
import java.util.*;
public class fun_03 {
    public static int sumodd(int n){
        int sum=0;
        if(n<0){
            return 0;
        }
        else {
            for(int i=1;i<=n;i++){
                if(i%2!=0){
                    sum+=i;
                } 
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumodd(n));
        sc.close();
    }
}
