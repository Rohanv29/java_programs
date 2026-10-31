package functions;

// WAP to show constructor calling sequence for multilevel inheritance
public class fun_07 {
    static class gfather {
        gfather() {
            System.out.println("Grandfather constructor");
        }
    }
    static class father extends gfather {
        father() {
            System.out.println("Father constructor");
        }
    }
    static class son extends father {
        son() {
            System.out.println("Son constructor");
        }
    }
    public static void main(String[] args) {
         son s = new son();

    }
}