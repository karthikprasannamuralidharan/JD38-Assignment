// 56. Write a program to check whether a character is uppercase or lowercase alphabet.

import java.util.Scanner;

public class UppercaseOrLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase alphabet.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
        sc.close();
    }
}

// Output:

// Enter a character: A
// A is an uppercase alphabet.

// Enter a character: a
// a is a lowercase alphabet.