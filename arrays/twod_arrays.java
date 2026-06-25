package arrays;
import java.util.*;
public class twod_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
         int [][] array=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(array[i][j]==x){
                    System.out.println(x + " is found at indices (" + i + "," + j + ")");
                }
            }
        }
        
    }
}
