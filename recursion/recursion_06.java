package recursion;

public class recursion_06 {
    public static void subsequences(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar =str.charAt(idx);
        subsequences(str, idx+1, newstr+currChar);

        subsequences(str, idx+1, newstr);

    }
    public static void main(String[] args) {
        String s="abba";
        String nw="";
        subsequences(s, 0, nw);
    }
}
