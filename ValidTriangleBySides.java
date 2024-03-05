// 60. Write a program to input all sides of a triangle and check whether the triangle is valid or not.

import java.util.Scanner;

public class ValidTriangleBySides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lengths of three sides of a triangle:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (isValidTriangle(side1, side2, side3)) {
            System.out.println("The triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is valid.");
        } else {
            System.out.println("The triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is not valid.");
        }
        sc.close();
    }

    public static boolean isValidTriangle(int side1, int side2, int side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}

// Output:

// Enter lengths of three sides of a triangle:
// 3
// 4
// 5
// The triangle with sides 3, 4, 5 is valid.

// Enter lengths of three sides of a triangle:
// 7
// 3
// 2
// The triangle with sides 7, 3, 2 is not valid.