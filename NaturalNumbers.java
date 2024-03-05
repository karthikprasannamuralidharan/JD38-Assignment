// 11. Write a program to print all natural numbers from 1 to n.

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Natural numbers from 1 to " + n + ":");
        printNaturalNumbers(n);
        sc.close();
    }
    
    public static void printNaturalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

// Output:

// Enter a number: 10
// Natural numbers from 1 to 10:
// 1 2 3 4 5 6 7 8 9 10