public class Main {
    public static void main(String[] args) {
        System.out.println("--- Doctor's Info ---");
        Doctor doc = new Doctor();
        doc.displayInfo();
        doc.treatPatient();

        System.out.println("\n--- Teacher's Info ---");
        Teacher tech = new Teacher();
        tech.displayInfo();
        tech.teach();

        System.out.println("\n--- Engineer's Info ---");
        Engineer eng = new Engineer();
        eng.displayInfo();
        eng.build();
    }
}

class Person {
    public void displayInfo() {
        System.out.println("Basic Info: This is a person.");
    }
}

class Doctor extends Person {
    public void treatPatient() {
        System.out.println("Role: Treats patients and cures illnesses.");
    }
}

class Teacher extends Person {
    public void teach() {
        System.out.println("Role: Teaches students and shares knowledge.");
    }
}

class Engineer extends Person {
    public void build() {
        System.out.println("Role: Designs and builds systems or structures.");
    }
}
