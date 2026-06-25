package recursion;

public class recursion_02 {
    public static void Reverse(String st,int i){
        if(i<0){
            return;
        }
        System.out.print(st.charAt(i));
        Reverse(st, i-1);
    }
    public static void main(String[] args) {
        String s="Rohan";
        int idx=s.length()-1;
        Reverse(s,idx);
    }   
}
