// 28. Write a program to calculate HCF of Two given numbers.
// The Highest Common Factor (HCF), also known as the Greatest Common Factor (GCF) or Greatest Common Divisor (GCD), of two or more integers is the largest positive integer that divides each of the integers without leaving a remainder.

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int hcf = calculateHCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

        sc.close();
    }

    public static int calculateHCF(int num1, int num2) {
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
// Enter second number: 12
// HCF of 24 and 12 is: 12