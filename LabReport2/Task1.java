import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the Second number: ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("The larger number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The larger number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}
