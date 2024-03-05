// 59. Write a program to input angles of a triangle and check whether the triangle is valid or not.

import java.util.Scanner;

public class ValidTriangleByAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three angles of a triangle:");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        if (isValidTriangle(angle1, angle2, angle3)) {
            System.out.println("The triangle with angles " + angle1 + ", " + angle2 + ", " + angle3 + " is valid.");
        } else {
            System.out.println("The triangle with angles " + angle1 + ", " + angle2 + ", " + angle3 + " is not valid.");
        }
        sc.close();
    }

    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
        return (angle1 + angle2 + angle3 == 180) && (angle1 > 0 && angle2 > 0 && angle3 > 0);
    }
}

// Output:

// Enter three angles of a triangle:
// 90
// 180
// 20
// The triangle with angles 90, 180, 20 is not valid.

// Enter three angles of a triangle:
// 90
// 45
// 45
// The triangle with angles 90, 45, 45 is valid.