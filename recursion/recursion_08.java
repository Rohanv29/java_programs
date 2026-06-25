package recursion;

public class recursion_08 {
    public static void permutaion(String str,String perstr){
        if(str.length()==0){
            System.out.println(perstr);
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String  newstr=str.substring(0,i)+str.substring(i+1);
            permutaion(newstr, perstr+currchar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutaion(str, "");
    }
}
