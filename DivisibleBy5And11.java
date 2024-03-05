// 50. Write a program to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;

public class DivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11.");
        } else {
            System.out.println(num + " is not divisible by both 5 and 11.");
        }

        sc.close();
    }
}

// Output:
// Enter a number: 55
// 55 is divisible by both 5 and 11.

// Enter a number: 121
// 121 is not divisible by both 5 and 11.