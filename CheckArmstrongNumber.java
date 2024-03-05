// 38. Write a Program to check Armstrong numbers or Not.

import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
        sc.close();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

}

// Output:

// Enter a number: 153
// 153 is an Armstrong number

// Enter a number: 255
// 255 is not an Armstrong number