// 36. Write a Program to check perfect numbers or Not.
// A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. In other words, a perfect number is a number that is half the sum of all of its positive divisors (including 1 but excluding itself).
// For example, 6 is a perfect number because its divisors are 1, 2, and 3, and 1+2+3=6. Similarly, 28 is a perfect number because its divisors are 1, 2, 4, 7, and 14, and 1+2+4+7+14=28.

import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
        sc.close();
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}

// Output:

// Enter a number: 28
// 28 is a perfect number

// Enter a number: 16
// 16 is not a perfect number