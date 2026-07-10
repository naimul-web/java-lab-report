public class Grandfather {
    public void company() {
        System.out.println("Grandfather's Asset: The family company.");
    }

    public static void main(String[] args) {
        Son obj = new Son();

        System.out.println("--- Demonstrating Multilevel Inheritance ---");

        obj.company();
        obj.car();
        obj.mobile();
    }
}

class Father extends Grandfather {
    public void car() {
        System.out.println("Father's Asset: A family car.");
    }
}

class Son extends Father {
    public void mobile() {
        System.out.println("Son's Asset: A gaming mobile.");
    }
}
