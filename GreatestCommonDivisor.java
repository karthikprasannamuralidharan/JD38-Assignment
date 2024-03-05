// 45. Write Java program to Find the (GCD) Greatest Common Divisor.
// The Greatest Common Divisor (GCD), also known as the Greatest Common Factor (GCF) or Highest Common Factor (HCF), of two or more integers is the largest positive integer that divides each of the integers without leaving a remainder.

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        sc.close();
    }

    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

// Output:

// Enter first number: 24
// Enter second number: 36
// GCD of 24 and 36 is: 12