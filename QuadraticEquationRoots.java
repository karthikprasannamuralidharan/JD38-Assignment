// 61. Write a program to find all roots of a quadratic equation.

import java.util.Scanner;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients of quadratic equation (a, b, c):");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots of the quadratic equation are: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root of the quadratic equation is: " + root);
        } else {
            System.out.println("The quadratic equation has imaginary roots.");
        }
        sc.close();
    }
}

// Output:

// Enter coefficients of quadratic equation (a, b, c):
// 2
// -2
// 2
// The quadratic equation has imaginary roots.

// Enter coefficients of quadratic equation (a, b, c):
// 2
// -5
// 2
// Roots of the quadratic equation are: 2.0 and 0.5