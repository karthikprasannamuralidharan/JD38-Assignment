// 39. Write a Program to check Prime numbers or not.

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isPrimeNumber(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        sc.close();
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Output:

// Enter a number: 28
// 28 is not a prime number

// Enter a number: 13
// 13 is a prime number