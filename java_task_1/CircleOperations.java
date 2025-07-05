import java.util.Scanner;

public class CircleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f\n", calculateCircumference(radius));
        System.out.printf("Area: %.2f\n", calculateArea(radius));

        sc.close();
    }

    static double calculateCircumference(double r) {
        return 2 * Math.PI * r;
    }

    static double calculateArea(double r) {
        return Math.PI * r * r;
    }
}