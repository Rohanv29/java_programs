// WAP to sort n number of names in lexicographical order
// using ArrayList and Collections.sort()

package java_basics;

import java.util.*;

public class user {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        ArrayList<String> arr = new ArrayList<>();

        System.out.println("Enter names:");

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLine());
        }
        Collections.sort(arr);

        System.out.println("Names in lexicographical order:");

        for (String name : arr) {
            System.out.println(name);
        }

        sc.close();
    }
}