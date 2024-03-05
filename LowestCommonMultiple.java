// 46. Write Java program to Find the (LCM) Lowest Common Multiple.
// The Lowest Common Multiple (LCM) of two or more integers is the smallest positive integer that is divisible by each of the given integers without leaving a remainder.
// Multiples of 12: 12, 24, 36, 48, 60, ...
// Multiples of 15: 15, 30, 45, 60, ...

import java.util.Scanner;

public class LowestCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int lcm = calculateLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }

    public static int calculateLCM(int num1, int num2) {
        return (num1 * num2) / calculateGCD(num1, num2);
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

// Enter first number: 12
// Enter second number: 15
// LCM of 12 and 15 is: 60