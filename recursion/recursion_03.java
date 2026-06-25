package recursion;

public class recursion_03 {

    static int first = -1;
    static int last = -1;

    public static void occurance(String s, char a, int i) {

        if (i == s.length()) {
            System.out.println("First: " + first);
            System.out.println("Last: " + last);
            return;
        }

        char currChar = s.charAt(i);

        if (currChar == a) {
            if (first == -1) {
                first = i;
            }
            last = i;
        }

        occurance(s, a, i + 1);
    }

    public static void main(String[] args) {
        String s = "aabbccddga";
        char a = 'a';

        occurance(s, a, 0);
    }
}