package recursion;

public class recursion_07 {
    public static String[]keypad={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printcomb(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currentchar=str.charAt(idx);
        String mapping =keypad[currentchar-'0'];
        for(int i=0;i<mapping.length();i++){
            printcomb(str, idx+1, combination+mapping.charAt(i));
        }

        //to be

    }
    public static void main(String[] args) {
        String s="23";
        printcomb(s, 0, "");

        
    }
}
