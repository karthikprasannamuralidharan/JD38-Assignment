// 29. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative, and zero entered.

import java.util.Scanner;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        char choice;
        
        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.print("Do you want to continue? (Y/N): ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        
        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zero numbers: " + zeroCount);

        sc.close();
    }
}

// Output:

// Enter a number: 3
// Do you want to continue? (Y/N): y

// Enter a number: 5
// Do you want to continue? (Y/N): y

// Enter a number: -5
// Do you want to continue? (Y/N): y

// Enter a number: 0
// Do you want to continue? (Y/N): y

// Enter a number: 0
// Do you want to continue? (Y/N): y

// Enter a number: 0
// Do you want to continue? (Y/N): n

// Count of positive numbers: 2
// Count of negative numbers: 1
// Count of zero numbers: 3