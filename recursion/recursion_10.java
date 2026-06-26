package recursion;

public class recursion_10 {
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertPlacements=placeTiles(n-m, m);

        //horizontally
        int horPLacements=placeTiles(n-1, m);

        return vertPlacements +horPLacements;
    }
    public static void main(String[] args) {
        int n=3,m=8;
        int total=placeTiles(n, m);
        System.out.println(total);
    }
}
