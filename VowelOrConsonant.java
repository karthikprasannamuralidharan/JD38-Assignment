// 2. Build a program that prompts the user to enter a character. Determine whether the character is a vowel or a consonant and display the result.

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                System.out.println("Vowel");
                break;
        
            default:
                System.out.println("Consonant");
                break;
        }
        sc.close();
    }
}

// Output:

// Enter a character: A
// Vowel

// Enter a character: z
// Consonant