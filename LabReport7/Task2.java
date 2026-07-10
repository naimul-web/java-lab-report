class Shape {
    public double area(double length, double width) {
        return length * width;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape myShape = new Shape();

        double rectangleArea = myShape.area(5.0, 4.0);
        System.out.printf("Area of Rectangle (5.0 x 4.0): %.2f%n", rectangleArea);

        double circleArea = myShape.area(3.0);
        System.out.printf("Area of Circle (radius 3.0): %.2f%n", circleArea);
    }
}
