// 41. Write a Program to Check Given String is a Palindrome or Not.

import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is not a palindrome string");
        }
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

// Output:

// Enter a string: madam
// madam is a palindrome string

// Enter a string: kite
// kite is not a palindrome string