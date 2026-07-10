public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("--- Calculator ---");
        System.out.println("Sum of 2 integers (5 + 10): " + calc.add(5, 10));
        System.out.println("Sum of 2 double numbers (5.5 + 4.3): " + calc.add(5.5, 4.3));
        System.out.println("Sum of 3 integers (10 + 20 + 30): " + calc.add(10, 20, 30));
    }
}
