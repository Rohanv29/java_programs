package conditional;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
    //     int a=10;
    //     if(a==10){
    //         System.out.println( "value of a is: " + a);
    //     }
    //     else System.out.println("no print");
    //     int n=sc.nextInt();
    //     if(n%2==0) System.out.println("given number "+ n+" is even number ");
    //     else System.out.println("odd number");
    switch (button) {
        case 1:System.out.println("Hello!");
            
            break;
        case 2:System.out.println("Namaste!");
            
            break;
    
        default: System.out.println("Bonjour");
            break;
    }
    sc.close();
    }
}
