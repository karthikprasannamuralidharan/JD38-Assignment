// 66. Find the absolute value of a number entered through the keyboard.
// The absolute value (or modulus) | x | of a real number x is the non-negative value of x without regard to its sign. 

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        double absoluteValue = Math.abs(number);
        System.out.println("Absolute value of " + number + " is " + absoluteValue);

        sc.close();
    }
}

// Output: 
// Enter a number: -5
// Absolute value of -5.0 is 5.