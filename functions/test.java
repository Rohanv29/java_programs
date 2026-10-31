package functions;
interface LivingBeing {
    void display();
}

class HumanBeing implements LivingBeing {
    double brainSize;
    int heartRate;
    String bloodGroup;
    String partner;

    HumanBeing(double brainSize, int heartRate, String bloodGroup, String partner) {
        this.brainSize = brainSize;
        this.heartRate = heartRate;
        this.bloodGroup = bloodGroup;
        this.partner = partner;
    }

    public void display() {
        System.out.println("Human Being Details:");
        System.out.println("Brain Size: " + brainSize);
        System.out.println("Heart Rate: " + heartRate);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Partner: " + partner);
    }
}

class Plants implements LivingBeing {
    double stemSize;
    double rootSize;

    Plants(double stemSize, double rootSize) {
        this.stemSize = stemSize;
        this.rootSize = rootSize;
    }

    public void display() {
        System.out.println("\nPlant Details:");
        System.out.println("Stem Size: " + stemSize);
        System.out.println("Root Size: " + rootSize);
    }
}

public class test {
    public static void main(String[] args) {
        HumanBeing h = new HumanBeing(1.4, 72, "O+", "Alex");
        Plants p = new Plants(15.5, 8.5);

        h.display();
        p.display();
    }
}