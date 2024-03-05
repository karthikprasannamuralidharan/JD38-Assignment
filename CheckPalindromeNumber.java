// 40. Write a Program to Check Given Number is a Palindrome or Not.
// A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward. For example, "radar" and "madam" are palindromes because they are spelled the same way backward and forward.

import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number");
        } else {
            System.out.println(number + " is not a palindrome number");
        }
        sc.close();
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}

// Output:

// Enter a number: 121
// 121 is a palindrome number

// Enter a number: 123
// 123 is not a palindrome number