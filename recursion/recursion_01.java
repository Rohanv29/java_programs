package recursion;

public class recursion_01 {
    public static void TOH(int n,char source,char auxiliary,char destination){
        //Best Case
        if(n==1){
            System.out.println("Move disk 1 from "+ source+" to "+destination);
            return ;
        }
        //Move n-1 disks from source to auxiliary
        TOH(n-1,source,destination,auxiliary);
        //MOve nth disk from source to destination
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        //move n-1 disks from auxiliary to destination
        TOH(n-1,auxiliary,source,destination);
    }
    public static void main(String[] args) {
        int n=3;
        TOH(n,'A','B','C');
    }
}
