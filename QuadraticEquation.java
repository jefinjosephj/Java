import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = s.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = s.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = s.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal.");
            System.out.println("Root = " + root);
        } else {
            System.out.println("The roots are not real.");
        }
    }
}
