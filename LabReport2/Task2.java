import java.util.Scanner;

public class Laab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the First number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter operator +,-,/,*: ");
        char operator = sc.next().charAt(0);
        
        System.out.print("Enter the Second number: ");
        double num2 = sc.nextDouble();
        
        double result = 0;
        
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                sc.close();
                return;
        }
        
        System.out.println("Result: " + result);
        sc.close();
    }
}
