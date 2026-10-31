
package functions;

import java.util.Scanner;

public class fun_06 {

    static class AgeException extends Exception {
        int age;

        AgeException(int x) {
            this.age = x;
        }

        @Override
        public String toString() {
            return "Illegal Age: " + age;
        }
    }

    static void CheckAge(int x) throws AgeException {
        if (x < 18) {
            throw new AgeException(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your age:");  
            int age = sc.nextInt();

            CheckAge(age);

            System.out.println("Welcome");
        } catch (AgeException e) {
            System.out.println("Exception found");
            System.out.println(e);
            System.out.println("You are not welcome, get out");
        } finally {
            System.out.println("Visit Again");
            sc.close();
        }
    }
}
