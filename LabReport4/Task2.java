public class IDCard {

    String name;
    String id;
    String department;
    String institution;

    // Constructor
    public IDCard(String name, String id, String department, String institution) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.institution = institution;
    }

    // Method to display ID card information
    public void showID() {
        System.out.println("----- ID CARD -----");
        System.out.println("Name: " + name);
        System.out.println("ID No: " + id);
        System.out.println("Department: " + department);
        System.out.println("Institution: " + institution);
        System.out.println("-------------------");
    }

    // Main method
    public static void main(String[] args) {
        IDCard studentID = new IDCard("NAimul Islm", "E253010", "CCE", "IIUC");
        studentID.showID();
    }
}
