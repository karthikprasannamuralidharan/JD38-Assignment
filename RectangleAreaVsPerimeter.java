// 67. Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle is greater than its perimeter.
// For example, the area of the rectangle with length = 5 and breadth = 4 is greater than its perimeter.

import java.util.Scanner;

public class RectangleAreaVsPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        if (area > perimeter) {
            System.out.println("The area of the rectangle is greater than its perimeter.");
        } else {
            System.out.println("The area of the rectangle is not greater than its perimeter.");
        }
        sc.close();
    }
}

// Output:

// Enter length of rectangle: 5
// Enter breadth of rectangle: 4
// The area of the rectangle is greater than its perimeter.