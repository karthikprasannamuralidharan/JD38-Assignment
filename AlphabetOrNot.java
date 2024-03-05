// 53. Write a program to check whether a character is alphabet or no.

import java.util.Scanner;

public class  AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not a alphabet.");
        }
        sc.close();
    }
}

// Output:

// Enter a character: A
// A is an alphabet.

// Enter a character: 1
// 1 is not a alphabet.