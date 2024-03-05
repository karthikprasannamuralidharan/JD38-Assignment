// 55. Write a program to input any character and check whether it is alphabet, digit, or special character.

import java.util.Scanner;

public class AlphabetOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
        sc.close();
    }
}

// Output:
// Enter a character: a
// a is an alphabet.
// Enter a character: Z
// Z is an alphabet.
// Enter a character: 5
// 5 is a digit.
// Enter a character: %
// % is a special character.