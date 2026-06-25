package recursion;

public class recursion_05 {

    public static String removeDuplicates(String str, int idx, String newStr) {

        // Base Case
        if (idx == str.length()) {
            return newStr;
        }

        char currChar = str.charAt(idx);

        if (newStr.indexOf(currChar) != -1) {
            return removeDuplicates(str, idx + 1, newStr);
        } else {
            return removeDuplicates(str, idx + 1, newStr + currChar);
        }
    }

    public static void main(String[] args) {

        String str = "abbccda";
        String ans = removeDuplicates(str, 0, "");

        System.out.println(ans);
    }
}